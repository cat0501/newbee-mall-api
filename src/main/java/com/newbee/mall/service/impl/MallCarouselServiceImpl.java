package com.newbee.mall.service.impl;

import com.newbee.mall.dao.CarouselMapper;
import com.newbee.mall.model.entity.Carousel;
import com.newbee.mall.model.vo.IndexCarouselVO;
import com.newbee.mall.model.vo.IndexConfigGoodsVO;
import com.newbee.mall.service.MallCarouselService;
import com.newbee.mall.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lemonade
 * @description
 * @updateTime 2022/8/17 11:53
 */
@Service
public class MallCarouselServiceImpl implements MallCarouselService {
    @Resource
    CarouselMapper carouselMapper;

    /**
     * @description 返回固定数量的轮播图
     * @author Lemonade
     * @param: number
     * @updateTime 2022/8/17 14:13
     * @return: java.util.List<com.newbee.mall.model.vo.IndexCarouselVO>
     */
    @Override
    public List<IndexCarouselVO> getCarouselsByNum(int number) {
        List<IndexCarouselVO> carouselVOS = new ArrayList<>();

        List<Carousel> carouselsByNum = carouselMapper.findCarouselsByNum(number);

        if (!CollectionUtils.isEmpty(carouselsByNum)){
            carouselVOS = BeanUtil.copyList(carouselsByNum, IndexCarouselVO.class);
            //BeanUtils.copyProperties(carouselsByNum, carouselVOS);
        }
        return carouselVOS;
    }

    @Override
    public List<IndexConfigGoodsVO> getConfigGoodsByNum(int configType, int number) {
        List<IndexConfigGoodsVO> indexConfigGoodsVOS = new ArrayList<>();


        return indexConfigGoodsVOS;
    }
}
