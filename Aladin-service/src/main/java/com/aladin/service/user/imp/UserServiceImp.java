package com.aladin.service.user.imp;

import com.aladin.service.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Resource
    private UserDao userDao ;

    @Override
    public User selectUser(Long usId) {
        return this.userDao.selectUser(usId);
    }

    @Override
    public List<User> selectAllUser() {
        return this.userDao.selectAllUser();
    }

    @Override
    public User selectUserByEmail(String email) {
        return this.userDao.selectUserByEmail(email);
    }

    @Override
    public void addUser(User user) {
         this.userDao.addUser(user);
    }

    @Override
    public User removeUser(Long usId) {
        return this.userDao.removeUser(usId);
    }

    @Override
    public User modifyUser(User user) {
        return this.userDao.modifyUser(user);
    }

}
