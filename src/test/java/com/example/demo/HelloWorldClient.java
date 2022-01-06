package com.example.demo;


import com.example.demo.webService.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by saeedi_m on 22/07/19.
 */
public class HelloWorldClient {
        public static void main(String[] args) throws Exception {

            URL url = new URL("http://localhost:8080/ws/hello?wsdl");
            QName qname = new QName("http://impl.webService.demo.example.com/", "HelloWorldImplService");

            Service service = Service.create(url, qname);

            HelloWorld hello = service.getPort(HelloWorld.class);

            System.out.println(hello.getHelloWorldAsString("mkyong"));
        }
}