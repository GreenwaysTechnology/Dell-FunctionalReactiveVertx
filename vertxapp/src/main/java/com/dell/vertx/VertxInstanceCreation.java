package com.dell.vertx;

import io.vertx.core.Vertx;

public class VertxInstanceCreation {
  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    System.out.println(vertx.toString());
  }
}
