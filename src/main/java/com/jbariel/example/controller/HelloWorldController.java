package com.jbariel.example.controller;

import com.jbariel.example.beans.InjectBean;
import com.jbariel.example.util.SingletonUtils;

public class HelloWorldController {

    private InjectBean injected;

    public HelloWorldController() {
        injected = SingletonUtils.getSingleton(InjectBean.class);
    }

    public void sayHello() {
        System.out.println("Hello Mr. Injected bean: " + injected.getPrintedName());
    }
}