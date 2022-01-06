package com.example.demo;

import com.example.demo.webService.impl.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * Created by saeedi_m on 22/07/19.
 */

@Configuration
public class HelloWorldPublisher {

    @Bean
    public Endpoint endpoint() {
       return Endpoint.publish("http://localhost:8080/ws/hello?wsdl", new HelloWorldImpl());
    }
}