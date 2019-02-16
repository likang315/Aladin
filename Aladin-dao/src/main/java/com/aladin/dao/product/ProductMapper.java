package com.aladin.dao.product;

import com.aladin.pojo.product.Product;
import com.aladin.pojo.product.ProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_product
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    int countByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_product
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    int deleteByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_product
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_product
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_product
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_product
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    List<Product> selectByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_product
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    Product selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_product
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_product
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_product
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_product
     *
     * @mbggenerated Thu Feb 14 01:20:24 CST 2019
     */
    int updateByPrimaryKey(Product record);
}