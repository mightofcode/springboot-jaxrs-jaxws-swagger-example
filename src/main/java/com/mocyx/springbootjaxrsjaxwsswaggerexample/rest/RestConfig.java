package com.mocyx.springbootjaxrsjaxwsswaggerexample.rest;

import com.google.common.collect.Lists;
import com.mocyx.springbootjaxrsjaxwsswaggerexample.rest.RestExample;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@Configuration
public class RestConfig {

    @Autowired
    Bus bus;

    @Autowired
    RestExample restExample;

    @Bean
    public Server rsServer() {
        JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
        endpoint.setBus(bus);
        endpoint.setAddress("/api");
        endpoint.setServiceBeans(Lists.newArrayList(restExample));
        //endpoint.setFeatures(Lists.newArrayList(new Swagger2Feature()));
        return endpoint.create();
    }
}
