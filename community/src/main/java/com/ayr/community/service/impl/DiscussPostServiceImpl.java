package com.ayr.community.service.impl;

import com.ayr.community.dao.DiscussPostMapper;
import com.ayr.community.entity.DiscussPost;
import com.ayr.community.service.DiscussPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostServiceImpl implements DiscussPostService {

    @Autowired
    private DiscussPostMapper discusPostMapper;

    @Override
    public List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit) {
        return discusPostMapper.selectDiscussPosts(userId,offset,limit);
    }

    @Override
    public int selectDiscussPostCount(int userId) {
        return discusPostMapper.selectDiscussPostCount(userId);
    }
}
