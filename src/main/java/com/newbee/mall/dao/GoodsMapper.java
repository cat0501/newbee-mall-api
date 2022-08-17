package com.newbee.mall.dao;

import com.newbee.mall.model.entity.Goods;

import java.util.List;

/**
 * @author Lemonade
 * @description
 * @updateTime 2022/8/17 16:02
 */
public interface GoodsMapper {
    List<Goods> selectByPrimaryKeys(List<Long> goodsIds);
}
