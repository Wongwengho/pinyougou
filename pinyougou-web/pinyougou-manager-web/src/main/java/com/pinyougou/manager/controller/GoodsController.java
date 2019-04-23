package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.common.pojo.PageResult;
import com.pinyougou.pojo.Goods;
import com.pinyougou.service.GoodsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * 商品审核表
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Reference(timeout = 10000)
    private GoodsService goodsService;

    /** 分页查询商品审核列表 */
    @GetMapping("/findByPage")
    public PageResult findByPage(Goods goods,Integer page,Integer rows){

        //设置状态为未审核
        goods.setAuditStatus("0");

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


    /** 商品审核,修改商品状态 */
    @GetMapping("/updateStatus")
    public boolean updateStatus(Long[] ids,String status){
        try {
            goodsService.updateStatus("audit_status",ids, status);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /** 商品审核,修改成删除状态 */
    @GetMapping("/delete")
    public boolean delete(Long[] ids){
        try {
            goodsService.updateStatus("is_delete",ids,"1");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
