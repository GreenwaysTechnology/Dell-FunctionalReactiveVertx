package com.dell.vertx.http;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

public class ResourceHttpVerticle extends AbstractVerticle {

  private void homePage(RoutingContext routingContext) {
    HttpServerResponse response = routingContext.response();
    response.end("Home Page");
  }

  @Override
  public void start() throws Exception {
    super.start();

    HttpServer httpServer = vertx.createHttpServer();

    Router homeRouter = Router.router(vertx);

    homeRouter.get("/").handler(this::homePage);
    //Application Routers instance
    Router greeterRouter = Router.router(vertx);

    //Greeter Resource
    greeterRouter.get("/hello").handler(routingContext -> {
      HttpServerResponse response = routingContext.response();
      response.end("hello");
    });
    greeterRouter.get("/hai").handler(routingContext -> {
      HttpServerResponse response = routingContext.response();
      response.end("hai");
    });
    greeterRouter.get("/welcome").handler(routingContext -> {
      HttpServerResponse response = routingContext.response();
      response.end("welcome");
    });

    Router userRouter = Router.router(vertx);
    //User Resource
    userRouter.get("/").handler(routingContext -> {
      HttpServerResponse response = routingContext.response();
      response.end("Users");
    });
    //Main Router
    //proxy router, receives requests, according to url mapping , req will redirected
    Router proxyRouter = Router.router(vertx);

    proxyRouter.mountSubRouter("/", homeRouter);
    proxyRouter.mountSubRouter("/api/greeter", greeterRouter);
    proxyRouter.mountSubRouter("/api/users", userRouter);


    httpServer.requestHandler(proxyRouter);

    httpServer.listen(8081, handler -> {
      System.out.println("HTTP Server is running at " + handler.result().actualPort());
    });


  }

  @Override
  public void stop() throws Exception {
    super.stop();
  }
}
