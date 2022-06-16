package com.guo.Dao.impl;

import com.guo.Dao.IuserDao;

public class userDaoImpl implements IuserDao {
    @Override
    public void saveAccount() {
        System.out.println("Dao层被调用了");

    }
}
