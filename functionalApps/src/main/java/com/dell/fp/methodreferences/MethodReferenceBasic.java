package com.dell.fp.methodreferences;

public class MethodReferenceBasic {
    public static void main(String[] args) {
        Printer printer = null;
        //Lambda syntax
        printer = (res) -> {
            System.out.println(res);
        };
        printer.print("Hello");
        printer = res -> System.out.println(res);
        printer.print("Hello");
        //Method Reference
        printer = System.out::println;
        printer.print("Hello");

        //Lambda
        UpperCase upperCase = null;
        upperCase = name -> name.toUpperCase();
        System.out.println(upperCase.convertToUpper("subramanian"));

        //Method Reference
        upperCase = String::toUpperCase;
        System.out.println(upperCase.convertToUpper("subramanian"));

    }
}
