package com.learning.hobby.User;

public interface UserService {
    void register(UserRegisterDTO userRegisterDTO);
    String login(UserLoginDTO userLoginDTO);
}
