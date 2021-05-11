package com.guobin.server.controller;

import com.guobin.server.services.TestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestServices testServices;

    /*@RequestMapping("/get")
    public String get(String name) {
        return testServices.get(name);
    }*/

    @RequestMapping("/get/{name}")
    public String get(@PathVariable String name) {
        return testServices.get(name);
    }
}
