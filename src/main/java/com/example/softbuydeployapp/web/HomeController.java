package com.example.softbuydeployapp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("")
    public String getStatus(){
        return "Application is up and runing";
    }
}
