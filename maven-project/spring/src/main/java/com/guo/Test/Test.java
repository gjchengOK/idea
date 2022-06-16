package com.guo.Test;

import com.guo.service.IuserService;
import com.guo.service.impl.userServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        userServiceImpl userService = new userServiceImpl();
//        userService.saveAccount();
        ApplicationContext appc = new ClassPathXmlApplicationContext("bean.xml");
        IuserService userService = (IuserService) appc.getBean("userService");
        System.out.println(userService);

    }
}
