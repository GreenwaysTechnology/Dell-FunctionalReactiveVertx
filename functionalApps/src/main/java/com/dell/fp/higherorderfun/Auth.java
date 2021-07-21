package com.dell.fp.higherorderfun;

public class Auth {
    public void login(String name, String password, Resolve<String> success, Reject<Throwable> failure) {
        //biz logic
        if (name.equals("admin") && password.equals("admin")) {
            success.resolve("Login Success");
        } else {
            failure.reject(new RuntimeException("Login Failed"));
        }
    }
}
