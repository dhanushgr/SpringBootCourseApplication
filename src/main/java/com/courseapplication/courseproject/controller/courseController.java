package com.courseapplication.courseproject.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class courseController {

  @GetMapping("/home")
  public String getMethodName() {
    return "home";
  }

}
