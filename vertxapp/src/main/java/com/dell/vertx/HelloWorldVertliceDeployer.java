package com.dell.vertx;

import io.vertx.example.util.Runner;

public class HelloWorldVertliceDeployer {
  public static void main(String[] args) {
//    Vertx vertx = Vertx.vertx();
//    vertx.deployVerticle(new HelloWorldVerticle());
    Runner.runExample(HelloWorldVerticle.class);
  }
}
