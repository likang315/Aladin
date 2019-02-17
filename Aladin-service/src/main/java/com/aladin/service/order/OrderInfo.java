package com.aladin.service.order;

import com.aladin.pojo.order.m_order;

/**
 * @Author: likang
 * @mail: 13571887352@163.com
 * @GitHub：https://github.com/likang315
 * @CreateTime： 2019/2/17 20:55
 */
public interface OrderInfo {

    /**
     * 读取订单的所有信息，用json 传给前端
     * @param order
     */
    public void orderInfo(m_order order);
}
