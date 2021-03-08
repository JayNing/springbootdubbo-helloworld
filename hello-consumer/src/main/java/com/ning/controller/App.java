package com.ning.controller;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@DubboComponentScan( basePackages = {
        "com.ning.controller"
} )
@SpringBootApplication
public class App{
    public static void main( String[] args ){
        SpringApplication.run(App.class,args);
    }
}
