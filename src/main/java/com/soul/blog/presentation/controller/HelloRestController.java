package com.soul.blog.presentation.controller;

import com.soul.blog.domain.model.entry.Hello;
import com.soul.blog.infrastructrue.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sould on 2016-02-29.
 */

@RestController
public class HelloRestController {

    @Autowired
    private HelloDao helloDao;

    @RequestMapping("/")
    public String index(){
        return "helloworld!";
    }

    @RequestMapping("/add")
    public Hello add(Hello hello){
        Hello helloData = helloDao.save(hello);

        return helloData;
    }

    @RequestMapping("/list")
    public List<Hello> list(Model model){
        List<Hello> helloList = helloDao.findAll();

        return helloList;
    }
}
