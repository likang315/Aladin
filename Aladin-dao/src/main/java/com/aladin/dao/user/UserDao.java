package com.aladin.dao.user;

import com.aladin.pojo.user.User;

import java.util.List;

public interface UserDao {

    /**
     * 通过主键查找一个用户
     * @param usId
     * @return 返回用户
     */
    User selectUser(Long usId);

    /**
     * 查询所有的用户
     * @return
     */
    List<User> selectAllUser();

    /**
     * 通过用户账户查询用户
     * @param counId
     * @return
     */
    User selectUserById(String counId);

    /**
     * 通过邮箱查询用户
     * @param email
     * @return
     */

    User selectUserByEmail(String email);

    /**
     * 增加一个用户
     * @param user
     * @return
     */

    void registUser(User user);

    /**
     * 通过用户ID删除一个用户
     * @param usId
     * @return
     */

    User removeUser(Long usId);

    /**
     * 修改一个用户
     * @param user
     * @return
     */

    User modifyUser(User user);
}
