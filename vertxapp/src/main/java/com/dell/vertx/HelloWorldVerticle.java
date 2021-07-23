package com.dell.vertx;

import io.vertx.core.AbstractVerticle;

public class HelloWorldVerticle extends AbstractVerticle {

  @Override
  public void start() throws Exception {
    super.start();
    System.out.println("Hello Verticle is being deployed");
  }

  @Override
  public void stop() throws Exception {
    super.stop();
    System.out.println("Hello Verticle is being undeployed");
  }
}
