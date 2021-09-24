package com.yanap.backend.controller;

import com.yanap.backend.response.IndexResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    public IndexResponse index() {
        return new IndexResponse("Hello, World!");
    }
}
