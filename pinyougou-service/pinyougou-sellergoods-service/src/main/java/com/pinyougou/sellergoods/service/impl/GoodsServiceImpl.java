package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.pinyougou.mapper.GoodsDescMapper;
import com.pinyougou.mapper.GoodsMapper;
import com.pinyougou.mapper.ItemCatMapper;
import com.pinyougou.mapper.ItemMapper;
import com.pinyougou.pojo.Goods;
import com.pinyougou.pojo.GoodsDesc;
import com.pinyougou.pojo.Item;
import com.pinyougou.pojo.ItemCat;
import com.pinyougou.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private ItemCatMapper itemCatMapper;

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

    /** 根据spu的id查询商品信息 */
    @Override
    public Map<String, Object> getGoods(Long goodsId) {
        try {
            Map<String,Object> dataModel = new HashMap<>();

            // 1. 查询tb_goods
            Goods goods = goodsMapper.selectByPrimaryKey(goodsId);

            // 2. 查询tb_goods_desc
            GoodsDesc goodsDesc = goodsDescMapper.selectByPrimaryKey(goodsId);

            // 3. 查询tb_item
            // SELECT * FROM tb_item WHERE goods_id = 149187842867973 ORDER BY is_default DESC
            Example example = new Example(Item.class);
            // 创建条件对象
            Example.Criteria criteria = example.createCriteria();
            //  goods_id = 149187842867973
            criteria.andEqualTo("goodsId",goodsId);
            //  ORDER BY is_default DESC
            example.orderBy("isDefault").desc();
            // 条件查询
            List<Item> itemList = itemMapper.selectByExample(example);

            dataModel.put("goods",goods);
            dataModel.put("goodsDesc",goodsDesc);
            dataModel.put("itemList", JSON.toJSONString(itemList));

            // 查询一级分类名称
            ItemCat itemCat1 = itemCatMapper.selectByPrimaryKey(goods.getCategory1Id());
            dataModel.put("itemCat1",itemCat1 != null ? itemCat1.getName() : "");

            // 查询二级分类名称
            ItemCat itemCat2 = itemCatMapper.selectByPrimaryKey(goods.getCategory2Id());
            dataModel.put("itemCat2",itemCat2 != null ? itemCat2.getName() : "");

            // 查询三级分类名称
            ItemCat itemCat3 = itemCatMapper.selectByPrimaryKey(goods.getCategory3Id());
            dataModel.put("itemCat3",itemCat3 != null ? itemCat3.getName() : "");

            return dataModel;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
