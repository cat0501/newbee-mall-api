package com.newbee.mall.controller.admin;

import com.newbee.mall.util.R;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author Lemonade
 * @updateTime 2022/8/16 11:27 PM
 */

@Api(value = "v1", tags = "后台管理系统——轮播图模块接口")
//@Log4j
@Log4j2
@RestController
@RequestMapping("/manage-api/v1")
public class AdminCarouselAPI {

    @GetMapping("/")
    public R list(){
        log.info("日志信息");
        return null;
    }

}
