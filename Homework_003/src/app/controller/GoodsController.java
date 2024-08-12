package app.controller;

import app.domain.Goods;
import app.service.GoodsService;
import org.springframework.stereotype.Component;

@Component
public class GoodsController {

    private final GoodsService goodsService;

    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    public Goods getGoodsById(long id){
        return goodsService.getById(id);
    }
}
