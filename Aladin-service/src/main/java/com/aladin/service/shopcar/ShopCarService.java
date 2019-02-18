package com.aladin.service.shopcar;

import com.aladin.pojo.product.Specs;

/**
 * @author ：lala
 * @date ：Created in 2019/2/17 21:03
 * @description：购物车内商品增删改查
 * @email: 18291929158@163.com
 */
public interface ShopCarService {
    void addProduct(Long productId,Integer number,Long userId);
}
