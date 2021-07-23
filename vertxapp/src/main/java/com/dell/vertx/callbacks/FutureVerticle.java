package com.dell.vertx.callbacks;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class FutureVerticle extends AbstractVerticle {

  //Future Object
  //future object which sends success result ; String
  public Future<String> getSuccessFuture() {
    Future<String> future = Future.future(handler -> {
      handler.complete("Hello Message"); //sending result asyncly
    });
    return future;
  }

  public Future<String> login(String userName, String password) {
    Future future = Future.future(handler -> {
//       String userName =" admin";
//       String password = "admin";
      if (userName.equals("admin") && password.equals("admin")) {
        handler.complete("Login Success");
      } else {
        handler.fail("Login Failed");
      }
    });
    return future;
  }

  @Override
  public void start() throws Exception {
    super.start();
    getSuccessFuture().onComplete(asyncResult -> {
      if (asyncResult.succeeded()) {
        System.out.println(asyncResult.result());
      }
    });

    login("admin", "admin").onComplete(asyncResult -> {
      if (asyncResult.succeeded()) {
        System.out.println(asyncResult.result());
      } else {
        System.out.println(asyncResult.cause().getMessage());
      }
    });
    login("foo", "admin").onComplete(asyncResult -> {
      if (asyncResult.succeeded()) {
        System.out.println(asyncResult.result());
      } else {
        System.out.println(asyncResult.cause().getMessage());
      }
    });

    login("admin", "admin")
      .onSuccess(status -> System.out.println(status))
      .onFailure(err -> System.out.println(err));

    login("admin", "admin")
      .onSuccess(System.out::println)
      .onFailure(System.out::println);
  }
}
