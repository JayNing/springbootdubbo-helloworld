package com.ning.serviceimpl;

import com.ning.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * ClassName: HelloServiceImpl
 * Description:
 * date: 2021/3/8 17:29
 *
 * @author ningjianjian
 */
@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String msg) {
        return "Hello, " + msg;
    }
}
