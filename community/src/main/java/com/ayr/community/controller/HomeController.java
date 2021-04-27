package com.ayr.community.controller;

import com.ayr.community.entity.DiscussPost;
import com.ayr.community.entity.Page;
import com.ayr.community.entity.User;
import com.ayr.community.service.DiscussPostService;
import com.ayr.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private DiscussPostService discussPostService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String getIndexPost(Model model, Page page){
        page.setPath("/index");
        page.setRecordCount(discussPostService.selectDiscussPostCount(0));
        System.out.println(page);
        List<DiscussPost> list = discussPostService.selectDiscussPosts(0,page.getOffset(),page.getStartRow());

        List<Map<String,Object>> discussPost = new ArrayList<>();

        if (list != null){
            for (DiscussPost post : list){
                Map<String,Object> map = new HashMap<>();
                map.put("post",post);
                User user = userService.selectUserById(post.getUserId());
                map.put("user",user);
                discussPost.add(map);
            }
        }

        model.addAttribute("discussPost",discussPost);

        return "index";
    }
}
