package com.aladin.dao.shopcar;


import com.aladin.pojo.shopcar.Shopdeta;

public interface ShopdetaDao {
    int deleteByPrimaryKey(Long id);

    int insert(Shopdeta record);

    int insertSelective(Shopdeta record);

    Shopdeta selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Shopdeta record);

    int updateByPrimaryKey(Shopdeta record);
}