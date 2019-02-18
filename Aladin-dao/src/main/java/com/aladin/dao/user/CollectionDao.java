package com.aladin.dao.user;

import com.aladin.pojo.user.UserCollection;

public interface CollectionDao {
    int deleteByPrimaryKey(Long cId);

    int insert(UserCollection record);

    int insertSelective(UserCollection record);

    UserCollection selectByPrimaryKey(Long cId);

    int updateByPrimaryKeySelective(UserCollection record);

    int updateByPrimaryKey(UserCollection record);

}
