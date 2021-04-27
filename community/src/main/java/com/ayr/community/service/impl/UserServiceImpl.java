package com.ayr.community.service.impl;

import com.ayr.community.dao.UserMapper;
import com.ayr.community.entity.User;
import com.ayr.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public User selectUserById(int id) {
        return mapper.selectUserById(id);
    }

    @Override
    public User selectUserByName(String username) {
        return mapper.selectUserByName(username);
    }

    @Override
    public User selectUserByEmail(String email) {
        return mapper.selectUserByEmail(email);
    }

    @Override
    public int insertUser(User user) {
        return mapper.insertUser(user);
    }

    @Override
    public int updateStatus(int id, int status) {
        return mapper.updateStatus(id, status);
    }

    @Override
    public int updateHeader(int id, String header) {
        return mapper.updateHeader(id, header);
    }

    @Override
    public int updatePassword(int id, String password) {
        return mapper.updatePassword(id, password);
    }
}
