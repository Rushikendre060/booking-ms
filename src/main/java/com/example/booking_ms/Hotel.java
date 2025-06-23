package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hotel {
    @GetMapping ("/Hotel")
    public String getdata() { return "Hotel booking at 50% discount ";}
}