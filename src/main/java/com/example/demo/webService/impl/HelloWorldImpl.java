package com.example.demo.webService.impl;

import com.example.demo.webService.HelloWorld;

import javax.jws.WebService;

/**
 * Created by saeedi_m on 22/07/19.
 */

@WebService(endpointInterface = "com.example.demo.webService.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

}