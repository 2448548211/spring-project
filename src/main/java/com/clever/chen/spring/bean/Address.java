package com.clever.chen.spring.bean;

import lombok.Data;

/**
 * @author ChenWang
 * @className Address
 * @date 2020/10/28 15:05
 * @since JDK 1.8
 */
@Data
public class Address {
    private Integer id;
    private String area;
    private String areaDetail;
    /*public void destroy(){
        System.out.println("address 销毁");
    }*/
}
