package com.dell.fp.interfaces;

public class FirstLambdaMain {
    public static void main(String[] args) {
        Greeter greeter = null;
        //Old annonmous inner class
        greeter = new Greeter() {
            @Override
            public void sayGreet() {
                System.out.println("Hello");
            }
        };
        greeter.sayGreet();
        //Lambda Syntax: fp syntax;
        greeter = () -> {
            System.out.println("Hello");
        };
        greeter.sayGreet();
        greeter = () -> {
            System.out.println("Hai");
        };
        greeter.sayGreet();
        greeter = () -> {
            System.out.println("Welcome");
        };
        greeter.sayGreet();
        greeter = () -> {
            System.out.println("How are you ?");
        };
        greeter.sayGreet();
    }
}
