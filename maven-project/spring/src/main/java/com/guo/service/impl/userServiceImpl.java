package com.guo.service.impl;

import com.guo.Dao.IuserDao;
import com.guo.Dao.impl.userDaoImpl;
import com.guo.service.IuserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class userServiceImpl implements IuserService {
    private IuserDao iuserDao=new userDaoImpl();
//    ApplicationContext app=new ClassPathXmlApplicationContext("bean.xml");


    @Override
    public void saveAccount() {
//        iuserDao=(IuserDao)app.getBean("userDao");
        iuserDao.saveAccount();
    }
}
