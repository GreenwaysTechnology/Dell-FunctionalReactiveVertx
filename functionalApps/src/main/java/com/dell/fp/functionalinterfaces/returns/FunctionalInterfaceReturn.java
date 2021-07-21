package com.dell.fp.functionalinterfaces.returns;

public class FunctionalInterfaceReturn {
    public static void main(String[] args) {
        GetName name = null;
        name = () -> {
            return "Subramanian";
        };
        System.out.println(name.getName());
        //code refactoring; if there is no more body, we can remove {} and return keyword
        name = () -> "Subramanian";
        System.out.println(name.getName());

        SetStockValue setStockValue = null;
        setStockValue = value -> value;
        System.out.println(setStockValue.computeValue(10));

    }
}
