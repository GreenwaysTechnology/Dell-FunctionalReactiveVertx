package com.dell.fp.higherorderfun;

@FunctionalInterface
public interface HttpHandler<T> {
    String handle(T payload);
}
