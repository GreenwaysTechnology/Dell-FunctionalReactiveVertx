package com.del.reactive.core.create;

import io.reactivex.rxjava3.core.Observable;

public class LifeCycleApi {
    public static void main(String[] args) {
        Observable.create(observer -> {
            System.out.println("Inside stream");
            observer.onNext("Hello");
            observer.onComplete();
        }).doOnSubscribe(consumer -> {
            System.out.println("init");
        }).doOnNext(data -> {
            System.out.println("Got Data : " + data);
        }).doOnError(err -> {
            System.out.println("Got Error" + err);
        }).doOnComplete(() -> {
            System.out.println("done!");
        }).subscribe();
    }
}
