package com.example.aad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

    @GetMapping("/clientBulkFeed")
    public String clientBulkFeed() {
        return "Bulk Feed Triggered Succesffully";
    }
}
