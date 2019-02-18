package com.aladin.web.controller.shopcar;

import com.aladin.pojo.product.Specs;
import com.aladin.service.shopcar.ShopCarService;
import com.aladin.service.shopcar.SpcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：lala
 * @date ：Created in 2019/2/17 20:30
 * @description：${description}
 * @email: 18291929158@163.com
 */
@Controller
public class ShopCarController {
    @Autowired
    ShopCarService shopCarService;

    /**
     * 添加商品
     */
    @RequestMapping("/add")
    public void add(Integer number,Long productId,Long userId) {
        shopCarService.addProduct(productId,number,userId);
    }

}
