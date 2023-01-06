package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiTest {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello world!";
    }

}
