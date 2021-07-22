package com.del.reactive.core.create;

import io.reactivex.rxjava3.core.Observable;

public class JustOperator {
    public static void main(String[] args) {
        Observable<Integer> intStream = Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        intStream.subscribe(System.out::println, System.out::println,
                () -> System.out.println("done"));
    }
}
