package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class user {

    public static void main(String[] args) {
        SpringApplication.run(user.class, args);
    }
    
    @RestController
    class WelcomeController { 
        @GetMapping("/") 
        public String welcome() {  
            return "Welcome to Devsecops course";  
        }
    }
}
