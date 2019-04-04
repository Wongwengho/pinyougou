package com.pinyougou.mapper;

import com.pinyougou.pojo.Brand;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author ASUS
 * @description com.pinyougou.mapper
 * @date 2019/3/27
 */
public interface BrandMapper extends Mapper<Brand> {

    /**多条件查询品牌*/
    List<Brand> findAll(Brand brand);

    /**批量删除*/
    void deleteAll(Serializable[] ids);

    /**查询所有的品牌(id与name)*/
    @Select("select id,name as text from tb_brand order by id asc")
    List<Map<String, Object>> findAllByIdAndName();
}
