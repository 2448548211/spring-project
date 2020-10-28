package com.clever.chen.spring.config;

import com.clever.chen.spring.bean.Address;
import com.clever.chen.spring.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ChenWang
 * @className Product
 * @date 2020/10/28 20:09
 * @since JDK 1.8
 */

/**
 * ssm 项目  xml + 注解方式
 * springboot  java config+ 注解方式
 */
/*第三方框架的资源--》不属于spring的资源*/
@Configuration
public class Product {

    @Bean/*（必须有返回对象，容器中的键的默认名字就是方法名称）*/
    public Address address(){
        Address address = new Address();
        return address;
    }
    @Bean
    public User user(){
        User user = new User();
        return user;
    }
}
