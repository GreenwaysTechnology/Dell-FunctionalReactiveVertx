package com.del.reactive.core.create;

import io.reactivex.rxjava3.core.Observable;

public class CreatePublisherSubscriber {
    public static void main(String[] args) {

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

        //Subscriber
//        stream.subscribe(data -> {
//            System.out.println(data);
//        }, err -> {
//            System.out.println(err);
//        }, () -> System.out.println("done"));

        stream.subscribe(System.out::println, System.out::println,
                () -> System.out.println("done"));
    }

}
