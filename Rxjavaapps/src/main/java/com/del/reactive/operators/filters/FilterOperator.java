package com.del.reactive.operators.filters;

import io.reactivex.rxjava3.core.Observable;

public class FilterOperator {
    public static void main(String[] args) {
        Observable<Integer> stream = Observable.range(1, 100)
                .filter(i -> {
                    System.out.println("I value" + i);
                    return i % 2 == 0;
                })
                .map(j -> {
                    System.out.println("Map j " + j);
                    return j;
                });
        stream.subscribe(System.out::println);
        //even numbers

    }
}
