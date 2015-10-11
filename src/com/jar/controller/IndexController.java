package com.jar.controller;

import com.jar.domain.Article;
import com.jar.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuzw_000 on 2015/8/21.
 */
@Controller
public class IndexController {


    @Autowired
    private ArticleService articleService;

    @RequestMapping({"/home","/"})
    public String index(Model model){

        List<Article> list = new ArrayList<Article>();

        list = articleService.show();

        model.addAttribute("newest",list);


        return "index";
    }



}
