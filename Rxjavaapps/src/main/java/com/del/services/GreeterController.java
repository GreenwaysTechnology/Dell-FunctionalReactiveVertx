package com.del.services;

public class GreeterController {
    private GreeterService greeterService;

    public GreeterController() {

    }

    public GreeterController(GreeterService greeterService) {
        this.greeterService = greeterService;
    }

    public void getGreeter() {
        this.greeterService.sendGreeter().subscribe(System.out::println, System.out::println,
                () -> System.out.println("done"));

    }
}
