package com.example.booking.com;

import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class train {
    @GetMapping("/train")
    public String getData() {return "Please book train on booking.com with 100% discount"; }
}