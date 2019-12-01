package com.example.test.controller;

import com.example.test.service.TestWhile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:HelloController
 * Package:com.example.test.controller
 * Description:
 * Date:2019/11/30 23:08
 * Author:mj@bjpowernode.com
 **/
@RestController
public class HelloController {
    @Autowired
    private TestWhile testWhile;
    @RequestMapping("/testWhile")
    public String hello(@RequestParam int size){
        testWhile.startMultiThread(size);
        return "hello I'm testing while";
    }
}
