package com.pinyougou.mapper;

import tk.mybatis.mapper.common.Mapper;

import com.pinyougou.pojo.Goods;

import java.util.List;
import java.util.Map;

/**
 * GoodsMapper 数据访问接口
 * @date 2019-03-28 18:45:33
 * @version 1.0
 */
public interface GoodsMapper extends Mapper<Goods>{

    /** 多条件分页查询商品 */
    List<Map<String,Object>> findAll(Goods goods);
}