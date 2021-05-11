package com.guobin.web.controller;

import com.guobin.server.apis.TestServicesApis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestWebController {

    @Value("${aa.bb}")
    private String value;

    /*@Autowired
    private TestServicesApis testServicesApis;*/

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getTest")
    public String getTest() {
        //String result = testServicesApis.get("通过web调用的");
        String result = this.restTemplate.getForObject("http://server-service/test/get/通过web调用的", String.class);
        return result;
    }

    @RequestMapping("/value")
    public String value() {
        return "value: " + value;
    }
}
