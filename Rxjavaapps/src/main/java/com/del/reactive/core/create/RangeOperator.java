package com.del.reactive.core.create;

import io.reactivex.rxjava3.core.Observable;

public class RangeOperator {
    public static void main(String[] args) {
        Observable<Integer> stream = Observable.range(1, 1000);
        stream.subscribe(System.out::println, System.out::println, () -> System.out.println("done"));
    }
}
