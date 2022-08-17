package com.newbee.mall.controller.mall;

import com.newbee.mall.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lemonade
 * @description
 * @updateTime 2022/8/17 10:24
 */
@Api(tags = "商城首页接口")
@RestController
@RequestMapping("/api/v1")
@Slf4j
public class MallIndexAPI {

    @ApiOperation("获取首页数据")
    @GetMapping("/index-info")
    public R indexInfo(){
        log.info("商城首页接口");
        return new R(200, "OK");
    }
}
