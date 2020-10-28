package com.clever.chen.spring.testmain;

import com.clever.chen.spring.bean.AnnotationTest;
import com.clever.chen.spring.bean.User;
import com.clever.chen.spring.controller.UserController;
import com.clever.chen.spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ChenWang
 * @className TestMain
 * @date 2020/10/28 17:30
 * @since JDK 1.8
 */
public class TestMain {
    public static void main(String[] args) {
        /*设置配置文件的路径*/
        String path = "classpath:spring-config.xml";
        /*根据路径获取对应的容器*/
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);

        /*根据容器中的ID获取对应的对象*/
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        applicationContext.close();

        /*UserServiceImpl userServiceImpl = applicationContext.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(userServiceImpl);*/

        /*AnnotationTest annotationTest = applicationContext.getBean("annotationTest", AnnotationTest.class);
        System.out.println(annotationTest);*/

        /*UserController userControlller = applicationContext.getBean("userController", UserController.class);
        System.out.println(userControlller);
        *//*可以通过@Autowired实现依赖注入*//*
        System.out.println(userControlller.userService);
        *//*@Service注解默认是单例模式*//*
        System.out.println(userControlller.userService2);*/

        /*因为是单例模式，所以局部引用变量依据 @Autowired注解 会自动指向该单例并且赋值给Controller
        * 注意没有@Autowired注解不会实现依赖注入
        * */
        /*UserServiceImpl userServiceImpl = applicationContext.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(userServiceImpl);*/

       /* UserController userController = applicationContext.getBean("userController", UserController.class);
        System.out.println(userController.userService);*/

        //System.gc();
    }
}
