package com.maple.guideserver.dao;

import com.maple.guideserver.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Maple on 2017/9/14.
 */
@Mapper
@Repository
public interface UserDao {
    List<User> getAllUser();
}
