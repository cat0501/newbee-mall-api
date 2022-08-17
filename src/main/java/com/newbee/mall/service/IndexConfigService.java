package com.newbee.mall.service;

import com.newbee.mall.model.vo.IndexConfigGoodsVO;

import java.util.List;

/**
 * @author Lemonade
 * @description
 * @updateTime 2022/8/17 15:49
 */
public interface IndexConfigService {
    List<IndexConfigGoodsVO> getConfigGoodsForIndex(int configType, int number);

}
