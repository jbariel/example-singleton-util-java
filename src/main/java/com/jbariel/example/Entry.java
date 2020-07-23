package com.jbariel.example;

import com.jbariel.example.controller.HelloWorldController;

public class Entry {
    public static void main(String[] args) {
        System.out.println("Main method is alive!!");
        HelloWorldController controller = new HelloWorldController();
        controller.sayHello();
        System.out.println("Main method is done!!");
    }
}