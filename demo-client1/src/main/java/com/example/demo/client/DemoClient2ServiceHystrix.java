package com.example.demo.client;

import org.springframework.stereotype.Component;


@Component
public class DemoClient2ServiceHystrix implements IDemoClient2Service {
    @Override
    public String feignTest() {
        return "error";
    }
}
