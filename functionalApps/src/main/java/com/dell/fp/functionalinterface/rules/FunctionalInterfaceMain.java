package com.dell.fp.functionalinterface.rules;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        Greeter greeter = null;
//        greeter = new Greeter() {
//            @Override
//            public void sayGreet() {
//                System.out.println("Greet");
//            }
//            @Override
//            public void sayHello() {
//                System.out.println("Hello");
//            }
//        };
//        greeter.sayGreet();
//       // greeter.sayHello();
        //lambda version
        //error
        greeter = ()->{
            System.out.println("h");
        };
        greeter.sayGreet();
    }
}
