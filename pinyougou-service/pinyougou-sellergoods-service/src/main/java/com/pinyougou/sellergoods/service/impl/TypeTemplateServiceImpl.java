package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pinyougou.common.pojo.PageResult;
import com.pinyougou.mapper.SpecificationOptionMapper;
import com.pinyougou.mapper.TypeTemplateMapper;
import com.pinyougou.pojo.SpecificationOption;
import com.pinyougou.pojo.TypeTemplate;
import com.pinyougou.service.TypeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author ASUS
 * @description com.pinyougou.sellergoods.service.impl
 * @date 2019/4/3
 */
@Service(interfaceName = "com.pinyougou.service.TypeTemplateService")
@Transactional
public class TypeTemplateServiceImpl implements TypeTemplateService {

    //注入mapper
    @Autowired
    private TypeTemplateMapper typeTemplateMapper;
    @Autowired
    private SpecificationOptionMapper specificationOptionMapper;

    @Override
    public void save(TypeTemplate typeTemplate) {
        typeTemplateMapper.insertSelective(typeTemplate);
    }

    @Override
    public void update(TypeTemplate typeTemplate) {
        typeTemplateMapper.updateByPrimaryKeySelective(typeTemplate);
    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public void deleteAll(Serializable[] ids) {
        try {
            typeTemplateMapper.deleteAll(ids);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public TypeTemplate findOne(Serializable id) {
        return typeTemplateMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TypeTemplate> findAll() {
        return null;
    }

    @Override
    public PageResult findByPage(TypeTemplate typeTemplate, int page, int rows) {
        try {
            //分页查询
            PageInfo<TypeTemplate> pageInfo = PageHelper.startPage(page, rows)
                    .doSelectPageInfo(new ISelect() {
                        @Override
                        public void doSelect() {
                            typeTemplateMapper.findAll(typeTemplate);
                        }
                    });
            return new PageResult(pageInfo.getTotal(),pageInfo.getList());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /** 根据模版id查询所有的规格与规格选项 */
    @Override
    public List<Map> findSpecByTemplateId(Long id) {
        try {
            /**
             * List<Map<String,Object>>:
             * [{"id":27,"text":"网络","options" : [{},{}]},
               {"id":32,"text":"机身内存","options" : [{},{}]}]
             */
            TypeTemplate typeTemplate = findOne(id);
            //1. 获取规格json字符串数据
            // [{"id":27,"text":"网络"},{"id":32,"text":"机身内存"}]
            // JSON.parseArray() : [{},{}]
            // JSON.parseObject() : {}
            String specIds = typeTemplate.getSpecIds();
            //把specIds转成List<Map>
            List<Map> specList = JSON.parseArray(specIds, Map.class);

            //迭代specList
            for (Map spec : specList) {
                // spec: {"id":27,"text":"网络"}
                // 获取id
                Long specId = Long.valueOf(spec.get("id").toString());
                // SELECT * FROM `tb_specification_option` WHERE spec_id = 27
                //封装查询条件
                SpecificationOption so = new SpecificationOption();
                so.setSpecId(specId);
                List<SpecificationOption> options = specificationOptionMapper.select(so);

                spec.put("options",options);
            }
            return specList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
