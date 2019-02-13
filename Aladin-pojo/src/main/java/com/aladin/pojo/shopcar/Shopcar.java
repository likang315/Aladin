package com.aladin.pojo.shopcar;

import java.util.Date;

public class Shopcar {
    /**
     *  列表自增id(主键)
     */
    private Long id;
    /**
     *  购物车id
     */
    private Long shopId;
    /**
     *  用户Id(外键)--用于关联用户信息
     */
    private Long userId;
    /**
     *  判断用户是否存在
     */
    private Byte stat;
    /**
     *  购物车添加时间
     */
    private Date cTime;
    /**
     *  购物车更新时间
     */
    private Date uTime;
    /**
     *  用户登陆状态-默认为0
     */
    private Byte status;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}