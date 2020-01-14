package com.k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/k8s")
    public String test(){
        return "hello k8sdeployment";
    }

    @GetMapping("/deployment")
    public String test2(){
        return "l want to deploy k8s deployment";
    }
}
