package com.clever.chen.spring.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;

/*这个注解来自于lombok插件和projectlombok包,可以根据注解的要求导入特定的无价值代码*/
/**
 * @author ChenWang
 * @className User
 * @date 2020/10/28 15:00
 * @since JDK 1.8
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    /**家乡*/
    private Address homeTown;
    /**快递收货地址*/
    private List<Address> addrs;
    /**各科目的分数*/
    private Map<String,Integer> scores;
    /**
     * 自定义的测试用的初始化方法
     * @author ChenWang
     * @date 2020/10/28 17:28
     */
    public void init(){
        this.username = "hello";
        System.out.println("这是初始化方法init()");
    }
    /**
     * 自定义的测试用的销毁方法
     * @author ChenWang
     * @date 2020/10/28 17:28
     */
    public void destory(){
        System.out.println("这是销毁方法destory()");
    }
}
