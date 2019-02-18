package com.aladin.service.user;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    /**
     * 通过主键查找一个用户
     * @param usId
     * @return 返回用户
     */
   public User selectUser(Long usId);

    /**
     * 查询所有的用户
     * @return
     */
   public List<User> selectAllUser();

    /**
     * 通过邮箱查询用户
     * @param email
     * @return
     */

   public User selectUserByEmail(String email);

    /**
     * 增加一个用户
     * @param user
     * @return
     */

   public void addUser(User user);

    /**
     * 通过用户ID删除一个用户
     * @param usId
     * @return
     */

   public User removeUser(Long usId);

    /**
     * 修改一个用户
     * @param user
     * @return
     */

   public User modifyUser(User user);


}
