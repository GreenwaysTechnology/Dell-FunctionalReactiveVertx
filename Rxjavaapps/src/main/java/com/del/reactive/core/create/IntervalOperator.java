package com.del.reactive.core.create;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class IntervalOperator {
    public static void main(String[] args) throws InterruptedException {
        Observable<Long> clock = Observable.interval(1000, TimeUnit.MILLISECONDS);
//        clock.subscribe(System.out::println, System.out::println,
//                () -> System.out.println("done"));

     //  Thread.sleep(5000);
        clock.blockingSubscribe(System.out::println, System.out::println,
                () -> System.out.println("done"));

    }
}
