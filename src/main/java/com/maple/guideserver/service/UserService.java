package com.maple.guideserver.service;

import com.maple.guideserver.dao.UserDao;
import com.maple.guideserver.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Maple on 2017/9/14.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> selectAllUser(){
        return userDao.getAllUser();
    }
}
