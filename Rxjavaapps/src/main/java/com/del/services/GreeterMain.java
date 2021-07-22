package com.del.services;

public class GreeterMain {
    public static void main(String[] args) {
        GreeterController greeterController = new GreeterController(new GreeterService());
        greeterController.getGreeter();
    }
}
