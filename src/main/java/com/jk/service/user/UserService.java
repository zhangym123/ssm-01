package com.jk.service.user;

import com.jk.entity.user.User;

import java.util.List;

/**
 * Created by ’≈—ﬁ√Ù on 2017/8/18.
 */
public interface UserService {
    List<User> selectUserList();

    void insertUser(User user);

    void deleteUserById(User user);


    User huiXianById(int userId);

    void updateUser(User user);

}
