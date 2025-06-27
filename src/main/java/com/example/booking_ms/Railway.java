package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Railway {
    @GetMapping ("/Railway")
    public String getdata() { return "Railway tickits from irctc @ 30% discount ";}
}
