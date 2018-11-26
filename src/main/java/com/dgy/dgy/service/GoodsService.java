package com.dgy.dgy.service;

import com.dgy.dgy.dao.GoodsDao;
import com.dgy.dgy.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsService {

    @Autowired
    GoodsDao goodsDao;

    public Result getGoodsList(){
        List list = goodsDao.getGoodsList();
        Result result = new Result();
        if(list.size()>=0){
            result.setCode(200);
            result.setData(list);
            result.setMsg("获取数据成功");
            return  result;
        }else{
            result.setCode(201);
            result.setMsg("获取数据失败");
            return  result;
        }
    }

    public Result findGoodsById(Integer id){
        List list = goodsDao.findGoodsById(id);
        Result result = new Result();
        if(list.size()>=0){
            result.setCode(200);
            result.setData(list);
            result.setMsg("获取数据成功");
            return  result;
        }else{
            result.setCode(201);
            result.setMsg("获取数据失败");
            return  result;
        }
    }

}
