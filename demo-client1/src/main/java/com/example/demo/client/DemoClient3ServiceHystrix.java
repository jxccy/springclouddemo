package com.example.demo.client;

import org.springframework.stereotype.Component;


@Component
public class DemoClient3ServiceHystrix implements IDemoClient3Service {
    @Override
    public String test1() {
        return "error";
    }
}
