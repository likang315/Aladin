package com.aladin.dao.user;

import com.aladin.pojo.user.User;

public interface UserDao {
    int deleteByPrimaryKey(Long usId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long usId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
