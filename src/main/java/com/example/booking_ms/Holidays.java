package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holidays {
    @GetMapping ("/Holidays")
    public String getdata() { return "use HOLIDAYS Promo CODE get 66% off  ";}
}
