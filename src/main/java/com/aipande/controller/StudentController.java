package com.aipande.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: WangPan
 * Description:学生控制类
 * Date-Of-Create:2020/7/31-21:05
 */
@Controller
public class StudentController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "hello SpringBoot!";
    }
}
