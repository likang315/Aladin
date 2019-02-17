package com.aladin.dao.order;

import com.aladin.pojo.order.m_order;

/**
 * 订单
 */
public interface m_orderMapper {

    /**
     * 添加订单
     * @param record
     * @return
     */
    int insert(m_order record);

    /**
     * 根据id 删除订单
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 根据订单号潮汛
     * @param id
     * @return
     */
    m_order selectByPrimaryKey(Integer id);

    /**
     * 根据id 修改订单
     * @param record
     * @return
     */
    int updateByPrimaryKey(m_order record);
}