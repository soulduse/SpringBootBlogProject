package com.soul.blog.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sould on 2016-02-29.
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index(Model model){
        model.addAttribute("name", "SpringBlog from Soulduse");

        return "hello";
    }
}
