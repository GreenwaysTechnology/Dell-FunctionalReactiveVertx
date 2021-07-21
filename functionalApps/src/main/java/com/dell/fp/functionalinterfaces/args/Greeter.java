package com.dell.fp.functionalinterfaces.args;

@FunctionalInterface
public interface Greeter {
    //args
    void sayGreet(String message, String toWhom);
}
