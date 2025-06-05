package com.example.springboothtmlapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*@Controller
public class HomeController {

  @GetMapping("/home")
  public String home() {
    return "home";  // returns home.html template from /templates
  }
}*/

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "Hello from Spring Boot";
    }
}
