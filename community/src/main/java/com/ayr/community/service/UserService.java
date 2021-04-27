package com.ayr.community.service;

import com.ayr.community.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User selectUserById(int id);

    User selectUserByName(String username);

    User selectUserByEmail(String email);

    int insertUser(User user);

    int updateStatus(@Param("id") int id, @Param("status") int status);

    int updateHeader(int id,String header);

    int updatePassword(int id,String password);
}
