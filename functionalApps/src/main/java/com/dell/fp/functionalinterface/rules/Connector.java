package com.dell.fp.functionalinterface.rules;

//functional interface
public interface Connector {
    //only one abstract method; SAM
    void connect();

    //static methods
    static void getConnector(){
        System.out.println("Connector STATIC methods");
    }
    //default methods
    default void httpConnect() {
        System.out.println("HTTP Connect");
    }
    default void sqlConnect() {
        System.out.println("SQL Connect");
    }
}
