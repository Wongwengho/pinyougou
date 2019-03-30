package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.Brand;
import com.pinyougou.service.BrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ASUS
 * @description com.pinyougou.manager.controller
 * @date 2019/3/27
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    /**
     * 引用服务
     * timeout:调用服务超时(1000毫秒)
     */
    @Reference(timeout = 10000)
    private BrandService brandService;

    /**查询全部品牌*/
    @GetMapping("/findAll")
    public List<Brand> findAll(){
        return brandService.findAll();
    }

    /**添加品牌*/
    @PostMapping("/save")
    public boolean save(@RequestBody Brand brand){
        try {
            brandService.save(brand);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**修改品牌*/
    @RequestMapping("/update")
    public boolean update(@RequestBody Brand brand){
        try {
            brandService.update(brand);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
