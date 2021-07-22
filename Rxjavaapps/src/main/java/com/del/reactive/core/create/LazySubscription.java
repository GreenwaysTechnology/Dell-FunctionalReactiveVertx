package com.del.reactive.core.create;

import io.reactivex.rxjava3.core.Observable;

public class LazySubscription {
    public static void main(String[] args) {
        Observable<String> stream = Observable.create(observer -> {
            System.out.println("Inside stream");
            observer.onNext("Hello");
        });
        System.out.println("Stream is ready to consume");
        //once subscribe is called only data emission starts
        stream.subscribe(System.out::println);
    }
}
