package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mansoon {
    @GetMapping ("/Mansoon")
    public String getdata() { return "Hotel Mansoon booking at 60% discount ";}
}