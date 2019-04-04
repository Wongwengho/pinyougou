package com.pinyougou.mapper;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import com.pinyougou.pojo.TypeTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * TypeTemplateMapper 数据访问接口
 * @date 2019-03-28 18:45:33
 * @version 1.0
 */
public interface TypeTemplateMapper extends Mapper<TypeTemplate>{

    /**多条件查询*/
    List<TypeTemplate> findAll(TypeTemplate typeTemplate);

    /**批量删除*/
    void deleteAll(@Param("ids") Serializable[] ids);
}