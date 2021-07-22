package com.del.reactive.core.create;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class TimerOperator {
    public static void main(String[] args) throws InterruptedException {

        //here streaming starts after 100ms ,that means data will be emitted only after 100ms only
        //before that main method got closed
        Observable<Long> timerStream = Observable.timer(1000, TimeUnit.MICROSECONDS);
        timerStream.subscribe(System.out::println, System.out::println, () -> System.out.println("done"));

        //Thread.sleep(5000);
        timerStream.blockingSubscribe(v -> System.out.println("Egg is ready!" + v));

    }
}
