package com.dell.vertx.multiverticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.example.util.Runner;

class GreeterVerticle extends AbstractVerticle {
  @Override
  public void start() throws Exception {
    super.start();
    System.out.println("Greeter ");
  }
}
class HelloVerticle extends AbstractVerticle {
  @Override
  public void start() throws Exception {
    super.start();
    System.out.println("Hello");
  }
}
public class MainMultiverticle extends AbstractVerticle {
  public static void main(String[] args) {
    Runner.runExample(MainMultiverticle.class);
  }

  @Override
  public void start() throws Exception {
    super.start();
    vertx.deployVerticle(new HelloVerticle());
    vertx.deployVerticle(new GreeterVerticle());

  }
}
