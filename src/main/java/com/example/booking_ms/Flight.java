package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Flight {
    
    @GetMapping("/Flight")
    public String getdata() {
        return "flight ticket are at @25% discount ";
    }

    @GetMapping("/IndigoFlight")
    public String putdata() {
        return "Indigo flight ticket are at @66% discount ";
    }
}
