package com.del.reactive.core.create;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.Callable;

public class CallableOperator {
    public static void main(String[] args) {
        Callable<String> callable = () -> {
            System.out.println("Hello World!");
            return "Hello World!";
        };

        Observable<String> observable = Observable.fromCallable(callable);

        observable.subscribe(item -> System.out.println(item), error -> error.printStackTrace(),
                () -> System.out.println("Done"));
    }
}
