package com.aladin.pojo.user;

import javax.validation.constraints.Size;
import java.util.Date;

public class User {
    /**
     *用户id，主键
     */
    private Long usId;
    /**
     *用户昵称
     */
    private String name;
    /**
     *用户邮箱
     */
    private String email;
    /**
     *用户的电话
     */
    @Size()
    private String phone;
    /**
     *用户原始密码
     */
    private String pwd;
    /**
     *用户头像
     */
    private String perTit;
    /**
     *用户的个性签名
     */
    private String perSign;
    /**
     *用户生日
     */
    private Date birth;
    /**
     *用户的账户
     */
    private String counId;
    /**
     *用户创建时间
     */
    private Date cTime;
    /**
     *更新时间
     */
    private Date uTime;
    /**
     * 用户状态，默认为1，表示用户存在，0表示不存在
     */
    private Byte stat;
    /**
     * 性别
     */
    private String sex;
    /**
     *盐值
     */
    private String salt;
    public Long getUsId()
    {
        return usId;
    }

    public void setUsId(Long usId)
    {
        this.usId = usId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPwd()
    {
        return pwd;
    }

    public void setPwd(String pwd)
    {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getPerTit()
    {
        return perTit;
    }

    public void setPerTit(String perTit)
    {
        this.perTit = perTit == null ? null : perTit.trim();
    }

    public String getPerSign() {
        return perSign;
    }

    public void setPerSign(String perSign) {
        this.perSign = perSign == null ? null : perSign.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
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

    public Byte getStat() {
        return stat;
    }

    public void setStat(Byte stat) {
        this.stat = stat;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }
}
