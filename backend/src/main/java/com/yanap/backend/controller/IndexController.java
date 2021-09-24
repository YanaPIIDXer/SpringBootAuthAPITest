package com.yanap.backend.controller;

import com.yanap.backend.response.MessageResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class IndexController {
    @RequestMapping("/")
    public MessageResponse index() {
        return new MessageResponse("Hello, World!");
    }
}
