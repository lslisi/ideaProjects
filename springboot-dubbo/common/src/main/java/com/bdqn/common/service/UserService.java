package com.bdqn.common.service;

import com.bdqn.common.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User findUser();
}
