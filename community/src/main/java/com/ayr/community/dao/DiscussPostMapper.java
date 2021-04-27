package com.ayr.community.dao;

import com.ayr.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DiscussPostMapper {

    /**
     * 搜索帖子的信息
     * @param userId 可以传入楼主的id
     * @param offset 分页的一页显示数据量
     * @param limit 第一页的第一行数据
     * @return 返回一个帖子的list集合
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /**
     * 查询帖子的数量
     * @param userId 可以传入楼主的id
     * @return 返回查询出的数量
     */
    int selectDiscussPostCount(@Param("userId") int userId);
}
