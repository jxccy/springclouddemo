package com.example.demo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value = "demo-client3", fallback = DemoClient2ServiceHystrix.class)
public interface IDemoClient3Service {

    @RequestMapping(value = "client3test")
    public String test1();


}
