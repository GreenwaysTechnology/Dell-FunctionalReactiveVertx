package com.dell.vertx.http;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;

public class HttpServerVertilcle extends AbstractVerticle {
  @Override
  public void start() throws Exception {
    super.start();
    HttpServer httpServer = vertx.createHttpServer();
    //listener for handling client request
    httpServer.requestHandler(request -> {
      HttpServerResponse response = request.response();
      response.end("Hello Vertx Web!");
    });
    //server
    httpServer.listen(8080, handler -> {
      System.out.println("Server is running at " + handler.result().actualPort());
    });

  }

  @Override
  public void stop() throws Exception {
    super.stop();
  }
}
