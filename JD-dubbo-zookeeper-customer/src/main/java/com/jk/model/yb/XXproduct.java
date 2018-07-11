/**
 * Copyright (C), 2015-2018, bin.yang.com
 * FileName: XXproduct
 * Author:   杨斌
 * Date:     2018/7/6 0006 15:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model.yb;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 杨斌
 * @create 2018/7/6 0006
 * @since 1.0.0
 */

public class XXproduct implements Serializable{

    private static final long serialVersionUID = -8350804518044841458L;

    private Integer id;
    private String create_date; //创建日期
    private String modify_date; //修改
    private Integer allocated_stock;  // 保留存货
    private String full_name;   //  全称
    private Double cost;   //成本
    private Integer hits;  //点击量
    private String image;
    private String introduction;  // 介绍 说明
    private Integer is_gift;  //是否礼物
    private Integer is_list;   // 是否列出
    private Integer is_marketable;  //启用会员价
    private Integer is_top;   // 是否 置顶
    private String keyword;   // 关键字
    private Double market_price;   // 市场价
    private String memo;   // 备注
    private Integer month_hits;   // 月点击
    private String  month_hits_date;   // 月点击日期
    private Integer month_sales;   // 月销售
    private String month_sales_date;   // 月销售日期
    private String name;   // 名称
    private Integer point;   // 要点
    private Double price;   // 销售价格
    private Integer sales;   // 销售
    private Integer score;   // 得分
    private Integer score_count;   // 计算
    private String seo_description;   // 搜索描述
    private String seo_keywords;   // seo 关键字
    private String seo_title;   // 网页标题
    private String sn;   // 编号
    private Integer stock;   // 库存
    private String stock_memo;   // 库存备注
    private Integer total_score;   // 总分数
    private String unit;   // 单位
    private Integer week_hits;   // 一周热门
    private String week_hits_date;   // 热打日期
    private Integer week_sales;   // 周销售
    private String week_sales_date;   // 周销售日期
    private Integer weight;   // 重量
    private Integer brand;   // 品牌
    private Integer goods;   // 商品
    private String product_category;   // 产品类别
    private String attribute_value4;   // 产品类别
    private String attribute_value1;   // 产品类别
    private String attribute_value2;   // 产品类别
    private String attribute_value3;   // 产品类别
    private String attribute_value5;   // 产品类别
    private String typename;   // 产品类别

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getModify_date() {
        return modify_date;
    }

    public void setModify_date(String modify_date) {
        this.modify_date = modify_date;
    }

    public Integer getAllocated_stock() {
        return allocated_stock;
    }

    public void setAllocated_stock(Integer allocated_stock) {
        this.allocated_stock = allocated_stock;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Double getCost() {
        return cost;
    }


    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getIs_gift() {
        return is_gift;
    }

    public void setIs_gift(Integer is_gift) {
        this.is_gift = is_gift;
    }

    public Integer getIs_list() {
        return is_list;
    }

    public void setIs_list(Integer is_list) {
        this.is_list = is_list;
    }

    public Integer getIs_marketable() {
        return is_marketable;
    }

    public void setIs_marketable(Integer is_marketable) {
        this.is_marketable = is_marketable;
    }

    public Integer getIs_top() {
        return is_top;
    }

    public void setIs_top(Integer is_top) {
        this.is_top = is_top;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Double getMarket_price() {
        return market_price;
    }

    public void setMarket_price(Double market_price) {
        this.market_price = market_price;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getMonth_hits() {
        return month_hits;
    }

    public void setMonth_hits(Integer month_hits) {
        this.month_hits = month_hits;
    }

    public String getMonth_hits_date() {
        return month_hits_date;
    }

    public void setMonth_hits_date(String month_hits_date) {
        this.month_hits_date = month_hits_date;
    }

    public Integer getMonth_sales() {
        return month_sales;
    }

    public void setMonth_sales(Integer month_sales) {
        this.month_sales = month_sales;
    }

    public String getMonth_sales_date() {
        return month_sales_date;
    }

    public void setMonth_sales_date(String month_sales_date) {
        this.month_sales_date = month_sales_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScore_count() {
        return score_count;
    }

    public void setScore_count(Integer score_count) {
        this.score_count = score_count;
    }

    public String getSeo_description() {
        return seo_description;
    }

    public void setSeo_description(String seo_description) {
        this.seo_description = seo_description;
    }

    public String getSeo_keywords() {
        return seo_keywords;
    }

    public void setSeo_keywords(String seo_keywords) {
        this.seo_keywords = seo_keywords;
    }

    public String getSeo_title() {
        return seo_title;
    }

    public void setSeo_title(String seo_title) {
        this.seo_title = seo_title;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getStock_memo() {
        return stock_memo;
    }

    public void setStock_memo(String stock_memo) {
        this.stock_memo = stock_memo;
    }

    public Integer getTotal_score() {
        return total_score;
    }

    public void setTotal_score(Integer total_score) {
        this.total_score = total_score;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getWeek_hits() {
        return week_hits;
    }

    public void setWeek_hits(Integer week_hits) {
        this.week_hits = week_hits;
    }

    public String getWeek_hits_date() {
        return week_hits_date;
    }

    public void setWeek_hits_date(String week_hits_date) {
        this.week_hits_date = week_hits_date;
    }

    public Integer getWeek_sales() {
        return week_sales;
    }

    public void setWeek_sales(Integer week_sales) {
        this.week_sales = week_sales;
    }

    public String getWeek_sales_date() {
        return week_sales_date;
    }

    public void setWeek_sales_date(String week_sales_date) {
        this.week_sales_date = week_sales_date;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getBrand() {
        return brand;
    }

    public void setBrand(Integer brand) {
        this.brand = brand;
    }

    public Integer getGoods() {
        return goods;
    }

    public void setGoods(Integer goods) {
        this.goods = goods;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public String getAttribute_value4() {
        return attribute_value4;
    }

    public void setAttribute_value4(String attribute_value4) {
        this.attribute_value4 = attribute_value4;
    }

    public String getAttribute_value1() {
        return attribute_value1;
    }

    public void setAttribute_value1(String attribute_value1) {
        this.attribute_value1 = attribute_value1;
    }

    public String getAttribute_value2() {
        return attribute_value2;
    }

    public void setAttribute_value2(String attribute_value2) {
        this.attribute_value2 = attribute_value2;
    }

    public String getAttribute_value3() {
        return attribute_value3;
    }

    public void setAttribute_value3(String attribute_value3) {
        this.attribute_value3 = attribute_value3;
    }

    public String getAttribute_value5() {
        return attribute_value5;
    }

    public void setAttribute_value5(String attribute_value5) {
        this.attribute_value5 = attribute_value5;
    }


}
