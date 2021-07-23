package com.dell.vertx.http;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

public class HTTPRoutersVerticle extends AbstractVerticle {

  private void homePage(RoutingContext routingContext) {
    HttpServerResponse response = routingContext.response();
    response.end("Home Page");
  }

  @Override
  public void start() throws Exception {
    super.start();

    HttpServer httpServer = vertx.createHttpServer();

    //Router instance
    Router router = Router.router(vertx);

    router.get("/").handler(this::homePage);

    //Greeter Resource
    router.get("/api/greeter/hello").handler(routingContext -> {
      HttpServerResponse response = routingContext.response();
      response.end("hello");
    });
    router.get("/api/greeter/hai").handler(routingContext -> {
      HttpServerResponse response = routingContext.response();
      response.end("hai");
    });
    router.get("/api/greeter/welcome").handler(routingContext -> {
      HttpServerResponse response = routingContext.response();
      response.end("welcome");
    });

    //client Request code
    httpServer.requestHandler(router);

    httpServer.listen(8081, handler -> {
      System.out.println("HTTP Server is running at " + handler.result().actualPort());
    });


  }

  @Override
  public void stop() throws Exception {
    super.stop();
  }
}
