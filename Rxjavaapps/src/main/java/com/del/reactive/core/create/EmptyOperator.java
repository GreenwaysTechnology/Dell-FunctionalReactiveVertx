package com.del.reactive.core.create;

import io.reactivex.rxjava3.core.Observable;

public class EmptyOperator {
    public static void main(String[] args) {
        Observable stream = Observable.empty();
        stream.subscribe(System.out::println, System.out::println, () -> System.out.println("done"));

    }
}
