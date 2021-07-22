package com.del.reactive.core.create;

import io.reactivex.rxjava3.core.Observable;

public class ErrorOnlyOperator {
    public static void main(String[] args) {
        Observable<String> errorStream = Observable.error(new RuntimeException("Something went wrong"));
        errorStream.subscribe(System.out::println, System.out::println, () -> System.out.println("done"));

    }

}
