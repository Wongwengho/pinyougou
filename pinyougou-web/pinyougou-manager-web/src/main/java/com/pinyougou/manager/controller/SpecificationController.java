package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.common.pojo.PageResult;
import com.pinyougou.pojo.Specification;
import com.pinyougou.pojo.SpecificationOption;
import com.pinyougou.service.SpecificationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 规格管理
 */
@RestController
@RequestMapping("/specification")
public class SpecificationController {

    //注入服务
    @Reference(timeout = 10000)
    private SpecificationService specificationService;

    /**分页查询列表*/
    @GetMapping("/findByPage")
    public PageResult findByPage(Specification specification,Integer page, Integer rows){
        try{
            // GET请求中文乱码
            if (StringUtils.isNoneBlank(specification.getSpecName())){
                specification.setSpecName(new String(specification
                        .getSpecName().getBytes("ISO8859-1"), "UTF-8"));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return specificationService.findByPage(specification,page,rows);
    }

    /**新增规格行*/
    @PostMapping("/save")
    public boolean save(@RequestBody Specification specification){
        try {
            specificationService.save(specification);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**根据这件查询规格选项*/
    @GetMapping("/findSpecOption")
    public List<SpecificationOption> findSpecOption(Long id){
        return specificationService.findSpecOption(id);
    }
    /**保存修改规格*/
    @PostMapping("/update")
    public boolean update(@RequestBody Specification specification){
        try {
            specificationService.update(specification);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**删除规格*/
    @GetMapping("/delete")
    public boolean delete(Long[] ids){
        try {
            specificationService.deleteAll(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
