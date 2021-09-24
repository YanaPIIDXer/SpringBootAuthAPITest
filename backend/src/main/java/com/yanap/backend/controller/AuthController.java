package com.yanap.backend.controller;

import com.yanap.backend.response.MessageResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @RequestMapping("/auth/index")
    public MessageResponse index() {
        return new MessageResponse("Auth Index");
    }
}
