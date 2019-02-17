package com.aladin.dao.shopcar;

import com.aladin.pojo.shopcar.Shopcar;

public interface ShopcarDao {
    int deleteByPrimaryKey(Long id);

    int insert(Shopcar record);

    int insertSelective(Shopcar record);

    Shopcar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Shopcar record);

    int updateByPrimaryKey(Shopcar record);
}