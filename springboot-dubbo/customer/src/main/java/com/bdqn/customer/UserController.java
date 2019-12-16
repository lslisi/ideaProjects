package com.bdqn.customer;

import com.bdqn.common.domain.User;
import com.bdqn.common.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class UserController {
    @Resource
    @Reference()
    private UserService userService;

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        return userService.getUsers();
    }
    @GetMapping("/getUser")
    public User findUser(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        return userService.findUser();
    }
}
