package com.dell.fp.builtinfp;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> predicate = null;
        predicate = value -> value % 2 == 0;
        System.out.println(predicate.test(10) ? "Even" : "Odd");
        System.out.println(predicate.test(3) ? "Even" : "Odd");

    }
}
