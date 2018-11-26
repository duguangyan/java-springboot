package com.dgy.dgy.dao;

import com.dgy.dgy.entity.Goods;
import com.dgy.dgy.entity.Shipin;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface GoodsDao {
    //查询
     @Select("select * from zpl_goods")
     public List<Goods> getGoodsList();


    //使用UserDaoProvider类的findUserById方法来生成sql
    @SelectProvider(type = UserDaoProvider.class, method = "findGoodsById")
    public List<Goods> findGoodsById(Integer id);
    class UserDaoProvider {
        public String findGoodsById(Integer id) {
            String sql = "SELECT * FROM zpl_goods";
            if (id != null) {
                sql += " where goodsId = #{id}";
            }
            return sql;
        }
    }
}

