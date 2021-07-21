package com.dell.fp.functionalinterfaces.args;

public class ArgsandParamsMain {
    public static void main(String[] args) {
        Greeter greeter = null;
        greeter = new Greeter() {
            @Override
            //message,toWhom are args
            public void sayGreet(String message, String toWhom) {
                System.out.println(message + " " + toWhom);
            }
        };
        //here Hello and Subramanian are parameters
        greeter.sayGreet("Hello", "Subramanian");

        //lambda
        greeter = (String message, String toWhom) -> {
            System.out.println(message + " " + toWhom);
        };
        greeter.sayGreet("Hello", "Subramanian");
    }
}
