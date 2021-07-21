package com.dell.fp.functionalinterface.rules;

public class FunctionalInterfaceWithDefaultMethods {
    public static void main(String[] args) {
        Connector connector = null;
        connector = () -> {
            System.out.println("Connect method");
        };
        connector.connect();
        connector.httpConnect();
        connector.sqlConnect();
        //static methods calling
        Connector.getConnector();
    }
}
