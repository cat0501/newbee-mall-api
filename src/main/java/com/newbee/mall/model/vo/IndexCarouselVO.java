package com.newbee.mall.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Lemonade
 * @description
 * @updateTime 2022/8/17 11:33
 */
@Data
public class IndexCarouselVO implements Serializable {
    @ApiModelProperty("轮播图图片地址")
    private String carouselUrl;

    @ApiModelProperty("轮播图点击后的跳转路径")
    private String redirectUrl;
}
