package com.dgy.dgy.controller;

import com.dgy.dgy.entity.Result;
import com.dgy.dgy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @GetMapping("/lists")
    public Result getGoodsList(){
        return goodsService.getGoodsList();
    }

    @GetMapping("/getGoodsById")
    public Result getGoodsById(Integer id){
        return goodsService.findGoodsById(id);
    }

}
