package com.zzy.zzy.test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello ,spring boot!";
    }

    
}