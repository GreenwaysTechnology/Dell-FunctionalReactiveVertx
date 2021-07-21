package com.dell.fp.interfaces;

public class AnonmousInnerclassMain {
    public static void main(String[] args) {
        Greeter greeter = null;
        //Hai implmentation via annonamous
        greeter = new Greeter() {
            @Override
            public void sayGreet() {
                System.out.println("Hello");
            }
        };
        greeter.sayGreet();

        //Hai
        greeter = new Greeter() {
            @Override
            public void sayGreet() {
                System.out.println("Hai");
            }
        };
        greeter.sayGreet();

        //welcome
        greeter = new Greeter() {
            @Override
            public void sayGreet() {
                System.out.println("Welcome");
            }
        };
        greeter.sayGreet();

        //How are you?
        greeter = new Greeter() {
            @Override
            public void sayGreet() {
                System.out.println("How are You!");
            }
        };
        greeter.sayGreet();
    }
}



