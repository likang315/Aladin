package com.aladin.dao.product;

import com.aladin.pojo.product.Specs;

public interface SpecsMapper {

    /**
     * @param productId
     * 通过商品id查找单品
     */
    Specs findSpecsByProductId(Long productId);

    /**
     * @param SpecsId
     * 通过单品id查找单品
     */
    Specs findSpecsBySpecsId(Long SpecsId);

}