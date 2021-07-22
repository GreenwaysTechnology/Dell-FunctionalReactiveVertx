package com.del.reactive.core.create;

import io.reactivex.rxjava3.core.Observable;

public class NeverOperator {
    public static void main(String[] args) {
        Observable<String> errorStream = Observable.never();
        errorStream.subscribe(System.out::println, System.out::println, () -> System.out.println("done"));

    }
}
