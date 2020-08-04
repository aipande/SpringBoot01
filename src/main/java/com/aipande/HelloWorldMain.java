package com.aipande;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: WangPan
 * Description:SpringBoot的主程序
 * SpringBootApplication注解：用于标注主程序类，说明这是一个SpringBoot应用
 * Date-Of-Create:2020/8/4-16:25
 */
@SpringBootApplication
public class HelloWorldMain {

    public static void main(String[] args) {
        //启动Spring应用
        SpringApplication.run(HelloWorldMain.class,args);
    }
}
