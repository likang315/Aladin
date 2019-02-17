package com.aladin.service.order;

/**
 * @Author: likang
 * @mail: 13571887352@163.com
 * @GitHub：https://github.com/likang315
 * @CreateTime： 2019/2/17 21:53
 */
public interface OrderManager {
    /**
     * 读取所有的order表
     */
    public void allOrder();

    /**
     * 读取未付款的order
     */
    public void unPayOrder();

    /**
     * 读取待收货的商品
     */
    public void waitReceive();

    /**
     * 读取已完成的商品
     */
    public void finishOrder();

}
