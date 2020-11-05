package com.example.demo;

import com.example.demo.client.IDemoClient2Service;
import com.example.demo.client.IDemoClient3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    private IDemoClient2Service demoClient2Service;

    @Autowired
    private IDemoClient3Service demoClient3Service;

    @RequestMapping(value = "test")
    public String test() {
        String str = demoClient2Service.feignTest() + ":" + demoClient3Service.test1();
        return str;
    }
}
