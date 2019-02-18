package com.aladin.dao.order;

import com.aladin.pojo.order.m_shopping;

import java.util.ArrayList;

/**
 * 订单商品表
 */
public interface m_shoppingMapper {


    /**
     * 添加商品
     * @param record
     * @return
     */
    int insert(m_shopping record);

    /**
     * 删除商品
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 查询商品
     * @param id
     * @return
     */
    m_shopping selectByPrimaryKey(Integer id);

    /**
     * 修改商品信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(m_shopping record);

    /**
     * 根据id查出所有单品，未写SQL映射
     * @param oid
     * @return
     */
    ArrayList<m_shopping> selectAllshopping(String oid);

}