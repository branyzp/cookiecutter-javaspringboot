package com.learning.hobby.user;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void register(UserRegisterDTO userRegisterDTO);
    String login(UserLoginDTO userLoginDTO);
}
