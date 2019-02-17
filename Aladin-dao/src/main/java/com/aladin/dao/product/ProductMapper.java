package com.aladin.dao.product;

import com.aladin.pojo.product.Product;

import java.util.List;

public interface ProductMapper {

    /**
     * @param name
     * 通过商品名查找商品
     */
    List<Product> findProductByName(String name);

    /**
     * @param categoryId
     * 通过商品分类id查找商品
     */
    List<Product> findProductByCategoryId(Long categoryId);

    /**
     * @param brandId
     * 通过商品品牌id查找商品
     */
    List<Product> findProductByBrandId(Long brandId);

}