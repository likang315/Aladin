package com.aladin.dao.user;

import com.aladin.pojo.user.Collection;

public interface CollectionDao {
    int deleteByPrimaryKey(Long cId);

    int insert(Collection record);

    int insertSelective(Collection record);

    Collection selectByPrimaryKey(Long cId);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);

}
