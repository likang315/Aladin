package com.aladin.pojo.shopcar;

import java.util.Date;

public class Shopdeta {
    /**
    * 添加商品目录自增(主键)
    */
    private Long id;
    /**
     *  购物车id(外键)--用于确定用户与购物车信息关联
     */
    private Long shopId;
    /**
     *  商品id(外键)--用于关联商品特征信息
     */
    private Long puduId;
    /**
     *  商品状态：确认是否为选中即将提交订单商品
     */
    private Byte status;
    /**
     *  添加同一商品数量 默认为1
     */
    private Integer number;
    /**
     *  判断商品是否存在
     */
    private Byte stat;
    /**
     *  商品添加时间
     */
    private Date cTime;
    /**
     *  商品更新时间
     */
    private Date uTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getPuduId() {
        return puduId;
    }

    public void setPuduId(Long puduId) {
        this.puduId = puduId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Byte getStat() {
        return stat;
    }

    public void setStat(Byte stat) {
        this.stat = stat;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Date getuTime() {
        return uTime;
    }

    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }
}