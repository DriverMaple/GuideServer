package com.maple.guideserver.controller;

import com.maple.guideserver.common.Result;
import com.maple.guideserver.entity.User;
import com.maple.guideserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Maple on 2017/9/14.
 */
@RestController
@RequestMapping(value = "/User")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public Result myUser(){
        Result result = new Result();
        try {
            List<User> users = userService.selectAllUser();
            result.setValue(users);
            result.setResult(Result.SUCCESS);
            return result;
        } catch (Exception e){
            result.setResult(Result.FAIL);
            result.setMessage(e.getMessage());
            return result;
        }
    }
}
