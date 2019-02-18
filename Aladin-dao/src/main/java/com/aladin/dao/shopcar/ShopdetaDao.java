package com.aladin.dao.shopcar;


import com.aladin.pojo.shopcar.Shopdeta;

import java.util.List;

public interface ShopdetaDao {
    int deleteByPrimaryKey(Long id);

    int insert(Shopdeta record);

    int insertSelective(Shopdeta record);

    Shopdeta selectByPrimaryKey(Long id);

    Shopdeta selectByPutuId(Long putuId);

    List<Shopdeta> selectAll(Long shopId);

    List<Shopdeta> selectProduct(Long shopId);

    int updateByPrimaryKeySelective(Shopdeta record);

    int updateByPrimaryKey(Shopdeta record);
}