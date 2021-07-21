package com.dell.fp.functionalinterfaces.args;

public class CodeRefactoring {
    public static void main(String[] args) {
        Greeter greeter = null;
        greeter = (String message, String toWhom) -> {
            System.out.println(message + " " + toWhom);
        };
        greeter.sayGreet("Hello", "Subramanian");
        //if function body has only one line of code : remove {}
        greeter = (String message, String toWhom) -> System.out.println(message + " " + toWhom);
        greeter.sayGreet("Hello", "Subramanian");

        //Type Inference Enabled (message,toWhom)
        greeter = (message, toWhom) -> System.out.println(message + " " + toWhom);
        greeter.sayGreet("Hello", "Subramanian");

        Name name = null;
        //if it is single parameter remove ()
        name = myName -> System.out.println(myName);
        name.setName("Subramanian");

        Adder adder = (a, b) -> {
            int c = a + b;
            System.out.println(c);
        };
        adder.add(10, 10);

    }


}
