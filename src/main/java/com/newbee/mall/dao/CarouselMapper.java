package com.newbee.mall.dao;

import com.newbee.mall.model.entity.Carousel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lemonade
 * @description
 * @updateTime 2022/8/17 11:55
 */
//@Mapper
public interface CarouselMapper {
    List<Carousel> findCarouselsByNum(@Param("number") int number);
}
