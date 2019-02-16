package com.aladin.pojo.product;

import java.util.Date;

public class Product {
    /**
     *自增id
     */
    private Long id;

    /**
     *商品id
     */
    private Long productId;

    /**
     *分类id
     */
    private Long categoryId;

    /**
     *品牌id
     */
    private Long brandId;

    /**
     *商品名
     */
    private String name;

    /**
     *价格区间
     */
    private String priceRange;

    /**
     *商品描述
     */
    private String detail;

    /**
     *商品状态
     */
    private Byte status;

    /**
     *商品销量
     */
    private Integer sale;

    /**
     *创建时间
     */
    private Date cTime;

    /**
     *更新时间
     */
    private Date uTime;

    /**
     *库存
     */
    private Integer stock;

    /**
     *图片id
     */
    private Long picId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_product.id
     *
     * @return the value of m_product.id
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_product.id
     *
     * @param id the value for m_product.id
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_product.product_id
     *
     * @return the value of m_product.product_id
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_product.product_id
     *
     * @param productId the value for m_product.product_id
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_product.category_id
     *
     * @return the value of m_product.category_id
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_product.category_id
     *
     * @param categoryId the value for m_product.category_id
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_product.name
     *
     * @return the value of m_product.name
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_product.name
     *
     * @param name the value for m_product.name
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_product.price_range
     *
     * @return the value of m_product.price_range
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public String getPriceRange() {
        return priceRange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_product.price_range
     *
     * @param priceRange the value for m_product.price_range
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange == null ? null : priceRange.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_product.detail
     *
     * @return the value of m_product.detail
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_product.detail
     *
     * @param detail the value for m_product.detail
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_product.status
     *
     * @return the value of m_product.status
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_product.status
     *
     * @param status the value for m_product.status
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_product.sale
     *
     * @return the value of m_product.sale
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public Integer getSale() {
        return sale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_product.sale
     *
     * @param sale the value for m_product.sale
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_product.c_time
     *
     * @return the value of m_product.c_time
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public Date getcTime() {
        return cTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_product.c_time
     *
     * @param cTime the value for m_product.c_time
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_product.u_time
     *
     * @return the value of m_product.u_time
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public Date getuTime() {
        return uTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_product.u_time
     *
     * @param uTime the value for m_product.u_time
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_product.stock
     *
     * @return the value of m_product.stock
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_product.stock
     *
     * @param stock the value for m_product.stock
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_product.pic_id
     *
     * @return the value of m_product.pic_id
     *
     * @mbggenerated Sat Feb 16 20:29:44 CST 2019
     */
    public Long getPicId() {
        return picId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_product.pic_id
     *
     * @param picId the value for m_product.pic_id
     *
     * @mbggenerated Sat Feb 16 20:29:44 CST 2019
     */
    public void setPicId(Long picId) {
        this.picId = picId;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_product.brand_id
     *
     * @return the value of m_product.brand_id
     *
     * @mbggenerated Sat Feb 16 20:29:44 CST 2019
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_product.brand_id
     *
     * @param brandId the value for m_product.brand_id
     *
     * @mbggenerated Sat Feb 16 20:29:44 CST 2019
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
}