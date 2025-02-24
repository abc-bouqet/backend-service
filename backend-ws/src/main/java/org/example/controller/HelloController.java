package org.example.controller;

import org.example.model.Message;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backend")
@CrossOrigin(origins = "http://localhost:4000")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return new Message("Hello, from Spring boot backend!").getMessage();
    }
}
