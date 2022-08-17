package com.newbee.mall.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Lemonade
 * @description
 * @updateTime 2022/8/17 11:32
 */
@Data
public class IndexInfoVO implements Serializable {
    @ApiModelProperty("轮播图(列表)")
    private List<IndexCarouselVO> carousels;

    @ApiModelProperty("首页热销商品(列表)")
    private List<IndexConfigGoodsVO> hotGoods;

    @ApiModelProperty("首页新品推荐(列表)")
    private List<IndexConfigGoodsVO> newGoods;

    @ApiModelProperty("首页推荐商品(列表)")
    private List<IndexConfigGoodsVO> recommendGoods;
}
