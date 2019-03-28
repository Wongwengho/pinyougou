package com.pinyougou.mapper;

import com.pinyougou.pojo.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ASUS
 * @description com.pinyougou.mapper
 * @date 2019/3/27
 */
public interface BrandMapper {
    /**查询全部品牌*/
    @Select("select * from tb_brand")
    List<Brand> findAll();
}
