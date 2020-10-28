package com.clever.chen.spring.controller;

import com.clever.chen.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author ChenWang
 * @className UserController
 * @date 2020/10/28 19:22
 * @since JDK 1.8
 */
@Controller
public class UserController {
    /*@Autowired 默认为类型查找*/
    /*@Resource 默认先名字再类型，且默认名值为当前属性名，默认类型为当前属性的类型*/
    /*@Resource(name = "userServiceImpl")*/
    /*@Resource(type = UserService.class)*/
    /*两个注解配合可以实现Resource注解的查名功能
    @Autowired
    @Qualifier("userServiceImpl")
    */
    public UserService userService;
    /*@Autowired
    public UserService userService2;*/
    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }
    /*@Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }*/
}
