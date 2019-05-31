package com.unicom.gitgithub.controller;


import com.unicom.gitgithub.entity.news;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



///http://127.0.0.1:8080/news/getAll

//前后端严格分离,就要用RestController,要给前端返回json数据.要用RestController
@RestController
@RequestMapping(value="news")
public class NewsController
{
    //会拦截当前炸你的那getAll路径
    @RequestMapping(value="getAll")
    public List<news> getAll()
    {
        news news1=new news(1,"fxl","哈哈哈");
        news news2=new news(2,"fww","hehe ");
        news news3=new news(3,"flb","heihei");
        List<news> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);
        return list;
    }
}
