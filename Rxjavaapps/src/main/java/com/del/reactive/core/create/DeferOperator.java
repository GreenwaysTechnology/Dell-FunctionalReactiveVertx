package com.del.reactive.core.create;

import io.reactivex.rxjava3.core.Observable;

public class DeferOperator {
    public static void main(String[] args) throws InterruptedException {
        Observable<String> observable = Observable.defer(() -> {
                 return Observable.just("hello");
        });

        observable.subscribe(time -> System.out.println(time));

        Thread.sleep(5000);

        observable.subscribe(time -> System.out.println(time));

    }
}
