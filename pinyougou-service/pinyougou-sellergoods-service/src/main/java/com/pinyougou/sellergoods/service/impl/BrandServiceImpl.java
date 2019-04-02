package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pinyougou.common.pojo.PageResult;
import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.Brand;
import com.pinyougou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author ASUS
 * @description com.pinyougou.sellergoods.service.impl
 * @date 2019/3/27
 */
@Service(interfaceName = "com.pinyougou.service.BrandService")
/**上面指定接口名,产生服务名,不然会用代理类的名称*/
@Transactional
public class BrandServiceImpl implements BrandService {

    //注入数据访问接口代理对象
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public void save(Brand brand) {
        brandMapper.insertSelective(brand);
    }

    @Override
    public void update(Brand brand) {
        brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public void deleteAll(Serializable[] ids) {
        try {
        /*for (Serializable id : ids) {
                delete(id);
            }*/
            // delete from tb_brand where id in(?,?,?)
            brandMapper.deleteAll(ids);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Brand findOne(Serializable id) {
        return null;
    }

    @Override
    public List<Brand> findAll() {
//        //开始分页
//        PageInfo<Brand> pageInfo = PageHelper.startPage(1, 10).
//                doSelectPageInfo(new ISelect() {
//                    @Override
//                    public void doSelect() {
//                        brandMapper.selectAll();
//                    }
//                });
//        System.out.println("总记录数: " + pageInfo.getTotal());
//        System.out.println("总页数: " + pageInfo.getPages());
//        return pageInfo.getList();
        return brandMapper.selectAll();
    }

    /**分页查询品牌*/
    @Override
    public PageResult findByPage(Brand brand, int page, int rows) {
        try {
            //开始分页
            PageInfo<Brand> pageInfo = PageHelper.startPage(page, rows)
                    .doSelectPageInfo(new ISelect() {
                        @Override
                        public void doSelect() {
                            brandMapper.findAll(brand);
                        }
                    });
            return new PageResult(pageInfo.getTotal(),pageInfo.getList());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
