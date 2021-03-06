package com.dgy.dgy.entity;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "zpl_goods")
public class Goods implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.goodsId
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer goodsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.goodsSn
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    private String goodssn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.goodsName
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    private String goodsname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.goodsImg
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    private String goodsimg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.goodsThums
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    private String goodsthums;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.brandId
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    private Integer brandid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.shopId
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    private Integer shopid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.marketPrice
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    private BigDecimal marketprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.shopPrice
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    private BigDecimal shopprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.goodsStock
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    private Integer goodsstock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.saleCount
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    private Integer salecount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.goodsUnit
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    private String goodsunit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.isSale
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    private Byte issale;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.goodsStatus
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    private Byte goodsstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zpl_goods.goodsSpec
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    private String goodsspec;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.goodsId
     *
     * @return the value of zpl_goods.goodsId
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.goodsId
     *
     * @param goodsid the value for zpl_goods.goodsId
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.goodsSn
     *
     * @return the value of zpl_goods.goodsSn
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public String getGoodssn() {
        return goodssn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.goodsSn
     *
     * @param goodssn the value for zpl_goods.goodsSn
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setGoodssn(String goodssn) {
        this.goodssn = goodssn == null ? null : goodssn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.goodsName
     *
     * @return the value of zpl_goods.goodsName
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.goodsName
     *
     * @param goodsname the value for zpl_goods.goodsName
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.goodsImg
     *
     * @return the value of zpl_goods.goodsImg
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public String getGoodsimg() {
        return goodsimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.goodsImg
     *
     * @param goodsimg the value for zpl_goods.goodsImg
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg == null ? null : goodsimg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.goodsThums
     *
     * @return the value of zpl_goods.goodsThums
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public String getGoodsthums() {
        return goodsthums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.goodsThums
     *
     * @param goodsthums the value for zpl_goods.goodsThums
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setGoodsthums(String goodsthums) {
        this.goodsthums = goodsthums == null ? null : goodsthums.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.brandId
     *
     * @return the value of zpl_goods.brandId
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public Integer getBrandid() {
        return brandid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.brandId
     *
     * @param brandid the value for zpl_goods.brandId
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.shopId
     *
     * @return the value of zpl_goods.shopId
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public Integer getShopid() {
        return shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.shopId
     *
     * @param shopid the value for zpl_goods.shopId
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.marketPrice
     *
     * @return the value of zpl_goods.marketPrice
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public BigDecimal getMarketprice() {
        return marketprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.marketPrice
     *
     * @param marketprice the value for zpl_goods.marketPrice
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setMarketprice(BigDecimal marketprice) {
        this.marketprice = marketprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.shopPrice
     *
     * @return the value of zpl_goods.shopPrice
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public BigDecimal getShopprice() {
        return shopprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.shopPrice
     *
     * @param shopprice the value for zpl_goods.shopPrice
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setShopprice(BigDecimal shopprice) {
        this.shopprice = shopprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.goodsStock
     *
     * @return the value of zpl_goods.goodsStock
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public Integer getGoodsstock() {
        return goodsstock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.goodsStock
     *
     * @param goodsstock the value for zpl_goods.goodsStock
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setGoodsstock(Integer goodsstock) {
        this.goodsstock = goodsstock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.saleCount
     *
     * @return the value of zpl_goods.saleCount
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public Integer getSalecount() {
        return salecount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.saleCount
     *
     * @param salecount the value for zpl_goods.saleCount
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setSalecount(Integer salecount) {
        this.salecount = salecount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.goodsUnit
     *
     * @return the value of zpl_goods.goodsUnit
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public String getGoodsunit() {
        return goodsunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.goodsUnit
     *
     * @param goodsunit the value for zpl_goods.goodsUnit
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setGoodsunit(String goodsunit) {
        this.goodsunit = goodsunit == null ? null : goodsunit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.isSale
     *
     * @return the value of zpl_goods.isSale
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public Byte getIssale() {
        return issale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.isSale
     *
     * @param issale the value for zpl_goods.isSale
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setIssale(Byte issale) {
        this.issale = issale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.goodsStatus
     *
     * @return the value of zpl_goods.goodsStatus
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public Byte getGoodsstatus() {
        return goodsstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.goodsStatus
     *
     * @param goodsstatus the value for zpl_goods.goodsStatus
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setGoodsstatus(Byte goodsstatus) {
        this.goodsstatus = goodsstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zpl_goods.goodsSpec
     *
     * @return the value of zpl_goods.goodsSpec
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public String getGoodsspec() {
        return goodsspec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zpl_goods.goodsSpec
     *
     * @param goodsspec the value for zpl_goods.goodsSpec
     *
     * @mbggenerated Sat Nov 17 15:10:08 CST 2018
     */
    public void setGoodsspec(String goodsspec) {
        this.goodsspec = goodsspec == null ? null : goodsspec.trim();
    }
}