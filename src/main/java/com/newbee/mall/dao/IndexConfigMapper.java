package com.newbee.mall.dao;

import com.newbee.mall.model.entity.IndexConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lemonade
 * @description
 * @updateTime 2022/8/17 14:26
 */
public interface IndexConfigMapper {

    List<IndexConfig> findIndexConfigsByTypeAndNum(@Param("configType") int configType, @Param("number") int number);
}
