package com.hebust.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: ldx
 * @date: 2020/3/26 - 12:10
 **/
@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "Hello SpringBoot!";
    }

}
