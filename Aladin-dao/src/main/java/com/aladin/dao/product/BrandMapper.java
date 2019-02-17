package com.aladin.dao.product;

import com.aladin.pojo.product.Brand;

import java.util.List;

public interface BrandMapper {

    /**
     * @param brandId
     * 按商品品牌id查找商品品牌信息
     */
    Brand findBrandById(Long brandId);

}