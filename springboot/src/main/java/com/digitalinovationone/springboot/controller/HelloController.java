package com.digitalinovationone.springboot.controller;

@RestController
public class HelloController {


    @GetMapping("/")
    public String helloMessage() {
        return "Hello, Digital Inoovation One!";
    }
}
