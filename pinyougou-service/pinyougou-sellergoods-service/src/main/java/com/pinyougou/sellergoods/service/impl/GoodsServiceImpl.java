package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.GoodsDescMapper;
import com.pinyougou.mapper.GoodsMapper;
import com.pinyougou.pojo.Goods;
import com.pinyougou.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author ASUS
 * @description com.pinyougou.sellergoods.service.impl
 * @date 2019/4/11
 */
@Service(interfaceName = "com.pinyougou.service.GoodsService")
@Transactional
public class GoodsServiceImpl implements GoodsService {

    //注入mapper
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsDescMapper goodsDescMapper;

    @Override
    public void save(Goods goods) {
        try {
            /**设置商品未审核状态*/
            goods.setAuditStatus("0");
            goodsMapper.insertSelective(goods);
            /**为商品描述对象设置主键id*/
            goods.getGoodsDesc().setGoodsId(goods.getId());
            goodsDescMapper.insertSelective(goods.getGoodsDesc());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Goods goods) {

    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public void deleteAll(Serializable[] ids) {

    }

    @Override
    public Goods findOne(Serializable id) {
        return null;
    }

    @Override
    public List<Goods> findAll() {
        return null;
    }

    @Override
    public List<Goods> findByPage(Goods goods, int page, int rows) {
        return null;
    }
}
