package com.lelo.source.hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/")
    public HelloResult sayHello() {
        return helloWorldService.getInfo();
    }


}