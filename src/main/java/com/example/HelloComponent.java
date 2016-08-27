package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by jiyeon on 2016. 8. 27..
 */
@Component
public class HelloComponent {

    @Value("${hello}")
    String hello;

    @Value("${hello}")
    static String staticHello;

    @Value("${hello}")
    private void setValue(String hello){
        staticHello = hello;
    }

    public String getHello(){
        return hello;
    }

    public String getStaticHello(){
        return staticHello;
    }
}
