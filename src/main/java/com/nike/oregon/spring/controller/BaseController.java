package com.nike.oregon.spring.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class BaseController {
    @GetMapping("/")
    String home(Principal user) {
        return "Hello " + user.getName();
    }
}
