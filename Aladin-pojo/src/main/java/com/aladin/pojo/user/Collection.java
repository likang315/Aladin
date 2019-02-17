package com.aladin.pojo.user;

import java.util.Date;

public class Collection {
    /**
     * 收藏id，主键
     */
    private Long cId;
    /**
     *收藏ID，唯一不可从复
     */
    private Long coId;
    /**
     *商品价格
     */
    private String gdsPri;
    /**
     *商品图片
     */
    private String gdsPic;
    /**
     *商品名称
     */
    private String gdsName;
    /**
     *用户账户
     */
    private Long counId;
    /**
     *商品id
     */
    private Long gdsId;
    /**
     *创建收藏时间
     */
    private Date cTime;
    /**
     *更新收藏时间
     */
    private Date uTime;
    /**
     *收藏状态，0表示有效，默认为0
     */
    private Byte statu;

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public Long getCoId() {
        return coId;
    }

    public void setCoId(Long coId) {
        this.coId = coId;
    }

    public String getGdsPri() {
        return gdsPri;
    }

    public void setGdsPri(String gdsPri) {
        this.gdsPri = gdsPri == null ? null : gdsPri.trim();
    }

    public String getGdsPic() {
        return gdsPic;
    }

    public void setGdsPic(String gdsPic) {
        this.gdsPic = gdsPic == null ? null : gdsPic.trim();
    }

    public String getGdsName() {
        return gdsName;
    }

    public void setGdsName(String gdsName) {
        this.gdsName = gdsName == null ? null : gdsName.trim();
    }

    public Long getCounId() {
        return counId;
    }

    public void setCounId(Long counId) {
        this.counId = counId;
    }

    public Long getGdsId() {
        return gdsId;
    }

    public void setGdsId(Long gdsId) {
        this.gdsId = gdsId;
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

    public Byte getStatu() {
        return statu;
    }

    public void setStatu(Byte statu) {
        this.statu = statu;
    }
}