package com.aladin.dao.user;

import com.aladin.pojo.user.Adress;

public interface AdressDao {
    int deleteByPrimaryKey(Long aId);

    int insert(Adress record);

    int insertSelective(Adress record);

    Adress selectByPrimaryKey(Long aId);

    int updateByPrimaryKeySelective(Adress record);

    int updateByPrimaryKey(Adress record);

}
