package com.liuj.dao;

import com.liuj.domain.User;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface IUserDao {
    List<User> findAll();
}
