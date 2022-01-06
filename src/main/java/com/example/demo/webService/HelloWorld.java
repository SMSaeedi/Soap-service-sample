package com.example.demo.webService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by saeedi_m on 22/07/19.
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL) //optional
public interface HelloWorld {

    @WebMethod
    String getHelloWorldAsString(String name);

}