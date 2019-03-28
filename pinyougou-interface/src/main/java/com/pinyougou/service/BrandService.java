package com.pinyougou.service;

import com.pinyougou.pojo.Brand;

import java.util.List;

/**
 * @author ASUS
 * @description com.pinyougou.service
 * @date 2019/3/27
 */
public interface BrandService {
    /**查询所有品牌*/
    List<Brand> findAll();
}
