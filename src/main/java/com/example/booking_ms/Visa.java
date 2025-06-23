package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Visa {
    @GetMapping ("/Visa")
    public String getdata() { return "Visa Status ";}
}