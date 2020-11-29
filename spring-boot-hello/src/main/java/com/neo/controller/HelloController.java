package com.neo.controller;

import com.neo.spi.HelloSPI;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ServiceLoader;

@RestController
public class HelloController {
	
    @RequestMapping("/")
    public String index() {
        ServiceLoader<HelloSPI> helloSPI = ServiceLoader.load(HelloSPI.class);
        StringBuilder sb = new StringBuilder();
        sb.append("Hello Spring Boot 2.0!"+" and ");
        for(HelloSPI h:helloSPI){
            sb.append(h.sayHello());
        }
        return sb.toString();
    }
}