package com.dell.fp.functionalinterface.rules.annotation;

public class FunctionalAnnotation {
    public static void main(String[] args) {
        Greeter greeter = null;

        greeter = () -> {
            System.out.println("Greeter");
        };
        greeter.sayGreet();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable");
            }
        };
        runnable.run();
        runnable = () -> {
            System.out.println("runnable");
        };
        runnable.run();
    }
}
