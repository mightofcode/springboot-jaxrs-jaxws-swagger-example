package com.mocyx.springbootjaxrsjaxwsswaggerexample.soap;

import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
@WebService(targetNamespace = "http://www.test.com", name = "SoapExample" )
public class SoapExample {

    @WebMethod
    public String helloSoap() throws Exception {
        return "hello soap";
    }

    @WebMethod(operationName = "echo")
    public  String echo(@WebParam(name = "param") String param) throws Exception {
        return param;
    }
}
