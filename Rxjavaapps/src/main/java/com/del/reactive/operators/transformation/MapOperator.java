package com.del.reactive.operators.transformation;

import io.reactivex.rxjava3.core.Observable;

public class MapOperator {
    public static void main(String[] args) {
        Observable<Integer> stream = Observable.range(1, 10)
                .map(i -> {
                    System.out.println("map is called for up Stream  " + i);
                    return i * 2; //logic to double the number
                })
                .map(j -> {
                    System.out.println("map is called for downstream " + j);
                    return j * 2;
                });

        stream.subscribe(System.out::println);
    }
}
