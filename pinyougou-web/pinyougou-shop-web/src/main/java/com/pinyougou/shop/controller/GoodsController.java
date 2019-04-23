package com.pinyougou.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.common.pojo.PageResult;
import com.pinyougou.pojo.Goods;
import com.pinyougou.service.GoodsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.List;

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

    /** 多条件分页查询商品 */
    @GetMapping("/findByPage")
    public PageResult findByPage(Goods goods, Integer page, Integer rows){
        //获取登录用户名
        String sellerId = SecurityContextHolder.getContext().getAuthentication().getName();
        //设置查询条件
        goods.setSellerId(sellerId);

        /** GET请求中文转码 */
        if (StringUtils.isNoneBlank(goods.getGoodsName())){
            try {
                goods.setGoodsName(new String(goods.getGoodsName().getBytes("ISO8859-1"),"UTF-8"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return goodsService.findByPage(goods,page,rows);
    }

    /** 商品上下架 */
    @GetMapping("/updateMarketable")
    public boolean updateMarketable(Long[] ids,String status){
        try {
            goodsService.updateStatus("is_marketable",ids,status);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
