package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.common.pojo.PageResult;
import com.pinyougou.pojo.ItemCat;
import com.pinyougou.service.ItemCatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品分类管理
 */
@RestController
@RequestMapping("/itemCat")
public class itemCatController {

    //注入service服务
    @Reference(timeout = 10000)
    private ItemCatService itemCatService;

    /**分页查询商品分类*/
    @GetMapping("/findItemCatByParentId")
    public List<ItemCat> findByPage(Long parentId){
        return itemCatService.findItemCatByParentId(parentId);
    }

}
