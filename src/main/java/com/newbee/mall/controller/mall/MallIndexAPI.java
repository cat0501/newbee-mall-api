package com.newbee.mall.controller.mall;

import com.newbee.mall.common.Constants;
import com.newbee.mall.common.IndexConfigTypeEnum;
import com.newbee.mall.model.vo.IndexCarouselVO;
import com.newbee.mall.model.vo.IndexConfigGoodsVO;
import com.newbee.mall.model.vo.IndexInfoVO;
import com.newbee.mall.service.IndexConfigService;
import com.newbee.mall.service.MallCarouselService;
import com.newbee.mall.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lemonade
 * @description
 * @updateTime 2022/8/17 10:24
 */
@Api(tags = "1-商城首页接口")
@RestController
@RequestMapping("/api/v1")
@Slf4j
public class MallIndexAPI {

    @Resource
    MallCarouselService mallCarouselService;
    @Resource
    IndexConfigService indexConfigService;

    @ApiOperation(value = "获取首页数据", notes = "轮播图、新品、推荐等")
    @GetMapping("/index-info")
    public R<IndexInfoVO> indexInfo(){
        IndexInfoVO indexInfoVO = new IndexInfoVO();
        log.info("商城首页接口");

        List<IndexCarouselVO> carouselsByNum = mallCarouselService.getCarouselsByNum(Constants.INDEX_CAROUSEL_NUMBER);
        indexInfoVO.setCarousels(carouselsByNum);

        List<IndexConfigGoodsVO> hostGoods = indexConfigService.getConfigGoodsForIndex(IndexConfigTypeEnum.INDEX_GOODS_HOT.getType(), Constants.INDEX_GOODS_HOT_NUMBER);
        List<IndexConfigGoodsVO> newGoods = indexConfigService.getConfigGoodsForIndex(IndexConfigTypeEnum.INDEX_GOODS_NEW.getType(), Constants.INDEX_GOODS_NEW_NUMBER);
        List<IndexConfigGoodsVO> recommendGoods = indexConfigService.getConfigGoodsForIndex(IndexConfigTypeEnum.INDEX_GOODS_RECOMMEND.getType(), Constants.INDEX_GOODS_RECOMMOND_NUMBER);
        indexInfoVO.setHotGoods(hostGoods);
        indexInfoVO.setNewGoods(newGoods);
        indexInfoVO.setRecommendGoods(recommendGoods);

        return new R<IndexInfoVO>().ok(indexInfoVO);
    }
}
