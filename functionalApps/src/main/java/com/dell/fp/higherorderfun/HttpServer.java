package com.dell.fp.higherorderfun;

public class HttpServer {
    public void requtHandler(HttpHandler<String> httpHandler) {
        String response = "Hello,This is response";
        String str= httpHandler.handle(response);
        System.out.println(str);
    }
}
