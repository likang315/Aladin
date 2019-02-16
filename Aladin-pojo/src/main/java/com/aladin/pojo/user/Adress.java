package com.aladin.pojo.user;

import java.util.Date;

public class Adress {
    /**
     *  地址表的序列id，主键
     */
    private Long aId;
    /**
     * 地址的id
     */
    private Long adId;
    /**
     * 接收者的名字
     */
    private String recName;
    //地址名
    /**
     * 接收者的名字
     */
    private String adName;

    /**
     *  地址的状态，是否是默认，0表示默认地址
     */
    private Byte stat;
    /**
     * 用户账户，表示外键
     */

    private String counId;

    /**
     * 创建时间
     */
    private Date cTime;

    /**
     * 更新时间
     */
    private Date uTime;

    public Long getaId() {
        return aId;
    }

    public void setaId(Long aId) {
        this.aId = aId;
    }

    public Long getAdId() {
        return adId;
    }

    public void setAdId(Long adId) {
        this.adId = adId;
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName == null ? null : recName.trim();
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public Byte getStat() {
        return stat;
    }

    public void setStat(Byte stat) {
        this.stat = stat;
    }

    public String getCounId() {
        return counId;
    }

    public void setCounId(String counId) {
        this.counId = counId == null ? null : counId.trim();
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
