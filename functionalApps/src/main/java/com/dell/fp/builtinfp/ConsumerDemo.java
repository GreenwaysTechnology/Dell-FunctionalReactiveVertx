package com.dell.fp.builtinfp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = null;
        consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("Hello");
        consumer = s -> System.out.println(s);
        consumer.accept("Hello");
        consumer = System.out::println;
        consumer.accept("Hello");
        //List
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.forEach(System.out::println);

    }
}
