package com.dell.fp.interfaces;

public class Hello implements Greeter {
    @Override
    public void sayGreet() {
        System.out.println("Hello!");
    }
}
