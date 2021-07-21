package com.dell.fp.higherorderfun;

public class Socket {
    //higher order function
    public void requestHandler(Handler handler) {
        handler.handle();
    }
}
