package com.newbee.mall.service.impl;

import com.newbee.mall.dao.GoodsMapper;
import com.newbee.mall.dao.IndexConfigMapper;
import com.newbee.mall.model.entity.Goods;
import com.newbee.mall.model.entity.IndexConfig;
import com.newbee.mall.model.vo.IndexConfigGoodsVO;
import com.newbee.mall.service.IndexConfigService;
import com.newbee.mall.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Lemonade
 * @description
 * @updateTime 2022/8/17 15:50
 */
@Service
public class IndexConfigServiceImpl implements IndexConfigService {

    @Resource
    IndexConfigMapper indexConfigMapper;
    @Resource
    GoodsMapper goodsMapper;

    @Override
    public List<IndexConfigGoodsVO> getConfigGoodsForIndex(int configType, int number) {
        List<IndexConfigGoodsVO> indexConfigGoodsVOS = new ArrayList<>();
        // 查找所有配置项
        List<IndexConfig> indexConfigs = indexConfigMapper.findIndexConfigsByTypeAndNum(configType, number);
        if (CollectionUtils.isEmpty(indexConfigs)){
            return indexConfigGoodsVOS;
        }

        // 取出所有的goodsId
        List<Long> goodsIds = indexConfigs.stream().map(IndexConfig::getGoodsId).collect(Collectors.toList());
        List<Goods> goodsList = goodsMapper.selectByPrimaryKeys(goodsIds);
        //BeanUtils.copyProperties(goodsList, indexConfigGoodsVOS);
        indexConfigGoodsVOS = BeanUtil.copyList(goodsList, IndexConfigGoodsVO.class);

        for (IndexConfigGoodsVO indexConfigGoodsVO : indexConfigGoodsVOS){
            // 处理字符串过长导致文字超出的问题
            indexConfigGoodsVO.setGoodsName(checkLength(indexConfigGoodsVO.getGoodsName(), 30));
            indexConfigGoodsVO.setGoodsIntro(checkLength(indexConfigGoodsVO.getGoodsIntro(), 22));
        }

        return indexConfigGoodsVOS;
    }

    String checkLength(String str, int length){
        if (str.length() > length) {
            str = str.substring(0, length) + "...";
        }
        return str;
    }
}
