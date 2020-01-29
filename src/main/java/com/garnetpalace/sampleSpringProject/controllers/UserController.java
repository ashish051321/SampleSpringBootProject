package com.garnetpalace.sampleSpringProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController{

    @GetMapping("/user")
    @ResponseBody
    public String getUsers(){
        return "Hello People ! This is ashish !";
    }
}