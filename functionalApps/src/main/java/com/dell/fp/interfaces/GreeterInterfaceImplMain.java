package com.dell.fp.interfaces;

public class GreeterInterfaceImplMain {
    public static void main(String[] args) {
        Greeter greeter = null;
        //create object for Hello
        greeter = new Hello();
        greeter.sayGreet();

        //create object for hai
        greeter = new Hai();
        greeter.sayGreet();
    }
}
