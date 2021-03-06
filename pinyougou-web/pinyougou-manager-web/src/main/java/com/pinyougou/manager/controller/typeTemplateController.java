package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.common.pojo.PageResult;
import com.pinyougou.pojo.TypeTemplate;
import com.pinyougou.service.TypeTemplateService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/**
 * 商品类型模板
 */
@RestController
@RequestMapping("/typeTemplate")
public class typeTemplateController {

    //注入service
    @Reference(timeout = 10000)
    private TypeTemplateService typeTemplateService;

    /**分页查询: 商品类型模板*/
    @GetMapping("/findByPage")
    public PageResult findByPage(TypeTemplate typeTemplate,Integer page,Integer rows){
        /**GET 请求中文转码*/
        if (typeTemplate != null && StringUtils.isNoneBlank(typeTemplate.getName())){
            try {
                typeTemplate.setName(new String(typeTemplate.getName().getBytes("ISO8859-1"),"UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return typeTemplateService.findByPage(typeTemplate,page,rows);
    }

    /**保存模板*/
    @PostMapping("/save")
    public boolean save(@RequestBody TypeTemplate typeTemplate){
        try {
            typeTemplateService.save(typeTemplate);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**修改模板*/
    @PostMapping("/update")
    public boolean update(@RequestBody TypeTemplate typeTemplate){
        try {
            typeTemplateService.update(typeTemplate);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**批量删除模板*/
    @GetMapping("/delete")
    public boolean delete(Long[] ids){
        try {
            typeTemplateService.deleteAll(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
