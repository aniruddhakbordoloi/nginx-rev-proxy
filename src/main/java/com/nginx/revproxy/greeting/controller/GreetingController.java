package com.nginx.revproxy.greeting.controller;

import com.nginx.revproxy.greeting.data.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private static final String template = "Hello, %s!";

    @GetMapping("")
    public Greeting greeting(@RequestParam(value = "user", defaultValue = "Dear") String name) {
        return new Greeting(String.format(template, name));
    }
}
