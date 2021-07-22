package com.del.reactive.operators.transformation;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class BufferOperator {
    public static void main(String[] args) {
        Observable<List<Integer>> stream = Observable.range(1, 10)
                .map(i -> {
                    System.out.println("map is called for up Stream  " + i);
                    return i * 2; //logic to double the number
                })
                .map(j -> {
                    System.out.println("map is called for downstream " + j);
                    return j * 2;
                })
                .buffer(3);
        stream.subscribe(System.out::println);
    }
}
