package com.dell.vertx.callbacks;

import io.vertx.core.AbstractVerticle;
import io.vertx.example.util.Runner;

public class FutureMain extends AbstractVerticle {
  public static void main(String[] args) {
    Runner.runExample(FutureMain.class);
  }

  @Override
  public void start() throws Exception {
    super.start();
    vertx.deployVerticle(new FutureVerticle());
  }
}
