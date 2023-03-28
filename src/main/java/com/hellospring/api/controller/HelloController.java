package com.hellospring.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class HelloController {

  @GetMapping
  public String home() {
    return "This is the mainpage, try \"/hello\"";
  }
  
  @GetMapping("hello")
  public String helloSpring() {
    return "Hello from Spring!!";
  }
  
}
