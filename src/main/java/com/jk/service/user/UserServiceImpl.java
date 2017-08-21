package com.jk.service.user;


import com.jk.entity.user.User;
import com.jk.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ’≈—ﬁ√Ù on 2017/8/18.
 */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void deleteUserById(User user) {
        userMapper.deleteUserById(user);
    }

    @Override
    public User huiXianById(int userId) {
        return userMapper.huiXianById(userId);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }




}
