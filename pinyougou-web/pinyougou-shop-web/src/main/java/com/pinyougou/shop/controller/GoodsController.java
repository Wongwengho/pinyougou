package com.pinyougou.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.Goods;
import com.pinyougou.service.GoodsService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ASUS
 * @description com.pinyougou.shop.controller
 * @date 2019/4/11
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    //注入service
    @Reference(timeout = 10000)
    private GoodsService goodsService;

    /**添加商品*/
    @PostMapping("/save")
    public boolean save(@RequestBody Goods goods){
        try {
            /**获取登录用户名(商家)*/
            String seller = SecurityContextHolder.getContext()
                    .getAuthentication().getName();
            goods.setSellerId(seller);
            goodsService.save(goods);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
