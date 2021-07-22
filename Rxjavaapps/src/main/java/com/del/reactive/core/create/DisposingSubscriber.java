package com.del.reactive.core.create;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

import java.util.concurrent.TimeUnit;

public class DisposingSubscriber {
    public static void main(String[] args) throws InterruptedException {
        Observable<Long> clock = Observable.interval(1000, TimeUnit.MILLISECONDS);
        Disposable disposable = clock.subscribe(System.out::println, System.out::println,
                () -> System.out.println("done"));
        disposable.dispose();
        Thread.sleep(10000);

    }

}
