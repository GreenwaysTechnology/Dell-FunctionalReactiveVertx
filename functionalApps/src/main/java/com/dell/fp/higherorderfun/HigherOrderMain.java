package com.dell.fp.higherorderfun;

class SocketImpl implements Handler {
    @Override
    public void handle() {
        System.out.println("Socket Handle Implemation");
    }
}

public class HigherOrderMain {
    public static void main(String[] args) {
        Socket socket = null;
        socket = new Socket();
        SocketImpl socketImpl = new SocketImpl();
        socket.requestHandler(socketImpl);
        //anonmous inner class
        socket.requestHandler(new Handler() {
            @Override
            public void handle() {
                System.out.println("Socket Annomous Handler");
            }
        });
        //use lambda
        socket.requestHandler(() -> System.out.println("Socket Lambda Handler"));
        Handler handler = () -> System.out.println("Socket Lambda Handler");
        socket.requestHandler(handler);

        ///Higher order function with args and parameters

        HttpServer httpServer = new HttpServer();
        httpServer.requtHandler((String response) -> {
            System.out.println(response);
            return "Connected";
        });
//        httpServer.requtHandler(response -> System.out.println(response));

        Auth auth = new Auth();
        auth.login("admin", "admin", status -> System.out.println(status), errorPayload ->
                System.out.println(errorPayload));
        auth.login("foo", "foo", status -> System.out.println(status), errorPayload ->
                System.out.println(errorPayload));
    }
}
