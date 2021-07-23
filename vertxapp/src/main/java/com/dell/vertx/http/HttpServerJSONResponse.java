package com.dell.vertx.http;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonObject;

public class HttpServerJSONResponse extends AbstractVerticle {
  @Override
  public void start() throws Exception {
    super.start();
    HttpServer httpServer = vertx.createHttpServer();
    //listener for handling client request
    httpServer.requestHandler(request -> {
      HttpServerResponse response = request.response();
      response.setStatusCode(200);
      response.putHeader("content-type", "application/json");
      JsonObject user = new JsonObject()
        .put("id", 1)
        .put("name", "Subramanian")
        .put("city", "coimbatore");

      response.end(user.encodePrettily());
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
