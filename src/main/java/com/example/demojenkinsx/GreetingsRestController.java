package com.example.demojenkinsx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsRestController {

    @GetMapping("/")
    public String greetings() {
        return "Hello Friends!!!!!";
    }
}
