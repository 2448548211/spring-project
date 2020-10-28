package com.clever.chen.spring.service.impl;

import com.clever.chen.spring.service.UserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author ChenWang
 * @className UserServiceImpl
 * @date 2020/10/28 19:15
 * @since JDK 1.8
 */
@Service
@Primary/*同ID中首位依赖注入（被查找到）*/
public class UserServiceImpl implements UserService {
    @Override
    public int test() {
        return 0;
    }
}
