package com.del.reactive.operators.transformation;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class ConcatMapOperator {
    public static void main(String[] args) {
        Observable.range(1, 5)
                .concatMap(i -> {
                    return Observable.just("A").map(n -> n + " " +  i);
                })
                .blockingSubscribe(System.out::print);

// prints 01234

    }
}
