package com.lambdalogic.jsf.demo.presentation;

import javax.annotation.PostConstruct;
import javax.inject.Named;

/**
 * A simple backing bean for the main index page.
 */
@Named
public class HelloBean {
    private String helloValue;

    public HelloBean() {
    }

    @PostConstruct
    public void initPage() {
        helloValue = "Hello World";
    }

    public String getHelloValue() {
        return helloValue;
    }

    public void setHelloValue(String helloValue) {
        this.helloValue = helloValue;
    }
}
