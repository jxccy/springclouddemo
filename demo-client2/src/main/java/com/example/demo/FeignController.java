package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @RequestMapping(value = "feignTest")
    public String feignTest() {
        return "feignTest";
    }
}
