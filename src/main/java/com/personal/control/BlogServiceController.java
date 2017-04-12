package com.personal.control;

import com.alibaba.druid.support.json.JSONUtils;
import com.google.gson.Gson;
import com.personal.entity.Blog;
import com.personal.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ASUS on 2017/4/12.
 */
@Controller
@RequestMapping("/blog")
public class BlogServiceController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/{id}/getBlogJson.do")
    public void getBlogJson(@ModelAttribute("id") int id, HttpServletResponse response, HttpServletRequest request){
        try {
            System.out.println(id);
            Blog blog= blogService.selectBlogById(id);
            PrintWriter printWriter = response.getWriter();
            Gson g = new Gson();
            String s =g.toJson(blog);
            System.out.println(s);
            printWriter.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
