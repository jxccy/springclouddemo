package com.example.demo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "demo-client2", fallback = DemoClient2ServiceHystrix.class)
public interface IDemoClient2Service {

    @RequestMapping(value = "/feignTest", method = {RequestMethod.GET})
    String feignTest();

}
