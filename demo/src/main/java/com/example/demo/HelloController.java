package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //RestController is a API endpoint getway
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "Hello World :) !!!";
    }



    @GetMapping("A")     //@GetMapping is a Spring Boot annotation that maps an HTTP GET request to a controller method.
    public String helloa(){
        return "Hello Atharva :) !!!";
    }
}
