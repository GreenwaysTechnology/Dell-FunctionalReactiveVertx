package com.dell.fp.builtinfp;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier supplier = null;
        supplier = () -> "Hello";
        System.out.println(supplier.get());
    }
}
