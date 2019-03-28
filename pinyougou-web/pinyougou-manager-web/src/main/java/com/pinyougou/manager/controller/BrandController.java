package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.Brand;
import com.pinyougou.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ASUS
 * @description com.pinyougou.manager.controller
 * @date 2019/3/27
 */
@RestController
public class BrandController {

    /**
     * 引用服务
     * timeout:调用服务超时(1000毫秒)
     */
    @Reference(timeout = 10000)
    private BrandService brandService;

    /**查询全部品牌*/
    @GetMapping("/brand/findAll")
    public List<Brand> findAll(){
        return brandService.findAll();
    }
}
