package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
public class DemoController {

    @GetMapping
    public String hello(@RequestParam String message) {
        log.info("Saw hello message {}", message);
        return "Hello " + message;
    }
}
