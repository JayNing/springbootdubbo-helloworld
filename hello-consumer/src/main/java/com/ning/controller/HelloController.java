package com.ning.controller;

import com.ning.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Description:
 * date: 2021/3/8 17:31
 *
 * @author ningjianjian
 */

@RestController
@RequestMapping("hello")
public class HelloController {

    @DubboReference
    private HelloService helloService;

    @RequestMapping("/say")
    public String say(String msg){
        return helloService.sayHello(msg);
    }

}
