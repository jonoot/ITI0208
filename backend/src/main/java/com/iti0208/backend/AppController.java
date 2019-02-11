package com.iti0208.backend;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AppController {

    @CrossOrigin
    @GetMapping("/")
    public String index() {
        return "Hello to you too!";
    }

}