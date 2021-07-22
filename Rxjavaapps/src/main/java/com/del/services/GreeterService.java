package com.del.services;

import io.reactivex.rxjava3.core.Observable;

public class GreeterService {
    public Observable<String> sendGreeter() {
        Observable<String> stream = Observable.create(observer -> {
            //push data.
            observer.onNext("Hello Reactive"); // streamming data
            observer.onNext("Welcome Reactive");
            observer.onNext("hai Reactive");
            // observer.onError(new RuntimeException("Something went wrong!!"));
            observer.onNext("greet Reactive");
            observer.onNext("how are you  Reactive");
            observer.onNext("what  about you Reactive");
            observer.onComplete(); // stream is closed
        });
        return stream;
    }
}
