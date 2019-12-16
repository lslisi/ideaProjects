package com.bdqn.provider.service.impl;

import com.bdqn.common.domain.User;
import com.bdqn.common.service.UserService;
import com.bdqn.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service()
public class UserImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser() {
        System.out.println("**************************-----finduser000------------**********************");
      //  return userMapper.getOne(1l);
        return userMapper.getOne(1l);
    }
    @Override
    public List<User> getUsers() {
        System.out.println("**************************-----getusers000------------**********************");
      //  return userMapper.getOne(1l);
        return userMapper.getAll();
    }
}