package com.aladin.service.order;

import com.aladin.pojo.order.m_order;
import com.aladin.pojo.product.Product;
import com.aladin.pojo.shopcar.Shopcar;

/**
 * @Author: likang
 * @mail: 13571887352@163.com
 * @GitHub：https://github.com/likang315
 * @CreateTime： 2019/2/17 20:46
 * */

public interface Order {

    /**
     * 从购物车生成订单id，状态码
     */
    public void createOrder(Shopcar sh);

    /**
     * 直接购买，生成订单号
     */
    public void directCreateOrder(Product pro);

    /**
     * 订单支付,修改状态码为：2
     */
    public void orderPay(m_order order);

    /**
     * 订单取消：即调用订单删除
     */
    public void orderCancel(m_order order);



    /**
     * 确认收货，修改订单状态码为：3
     * @param order
     */
    public void orderfinish(m_order order);
    /**
     * 删除订单
     * @param order
     */
    public void orderDelete(m_order order);



}
