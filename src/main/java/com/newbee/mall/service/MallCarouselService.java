package com.newbee.mall.service;

import com.newbee.mall.model.vo.IndexCarouselVO;
import com.newbee.mall.model.vo.IndexConfigGoodsVO;

import java.util.List;

/**
 * @author Lemonade
 * @description
 * @updateTime 2022/8/17 11:52
 */
public interface MallCarouselService {
    /**
     * @description 返回固定数量的轮播图
     * @author Lemonade
     * @param:
     * @updateTime 2022/8/17 11:53
     * @return: java.util.List<com.newbee.mall.model.vo.IndexCarouselVO>
     */
    List<IndexCarouselVO> getCarouselsByNum(int number);

    /**
     * @description 返回固定数量的商品对象
     * @author Lemonade
     * @param: configType
     * @param: number
     * @updateTime 2022/8/17 14:24
     * @return: java.util.List<com.newbee.mall.model.vo.IndexConfigGoodsVO>
     */
    List<IndexConfigGoodsVO> getConfigGoodsByNum(int configType, int number);
}
