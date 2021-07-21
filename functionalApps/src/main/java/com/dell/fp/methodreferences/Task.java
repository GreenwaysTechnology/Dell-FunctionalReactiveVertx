package com.dell.fp.methodreferences;

class MicroTask {
    public void startMicroTask() {
        System.out.println(Thread.currentThread().getName() + " Running");
    }
    public static void startMicroTasks() {
        System.out.println(Thread.currentThread().getName() + " Running");
    }
}

public class Task {

    //thread logic into separate method
    private void startMicroTask() {
        System.out.println(Thread.currentThread().getName() + " Running");
    }

    public void startTask() {
        //Thread implementation : using legacy , lambda,Method reference
        Thread thread = null;
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //is having biz logic of thread execution
                System.out.println(Thread.currentThread().getName() + " Running");
            }
        });
        thread.setName("Thread-1");
        thread.start();

        //lambda
        //is having biz logic of thread execution
        thread = new Thread(() -> System.out.println(Thread.currentThread().getName() + " Running"));
        thread.setName("Thread-2");
        thread.start();

        //isolate Thread logic out
        Runnable runnable = () -> System.out.println(Thread.currentThread().getName() + " Running");
        thread = new Thread(runnable);
        thread.setName("Thread-3");
        thread.start();
        //isolate Thread logic out into method
        thread = new Thread(() -> this.startMicroTask());
        thread.setName("Thread-4");
        thread.start();

        //isolate Threading logic and refer using method Reference
        thread = new Thread(this::startMicroTask);
        thread.setName("Thread-5");
        thread.start();

        //isolate Threading logic into separate class and refer using method Reference
        MicroTask microTask = new MicroTask();
        thread = new Thread(microTask::startMicroTask);
        thread.setName("Thread-6");
        thread.start();

        thread = new Thread(new MicroTask()::startMicroTask);
        thread.setName("Thread-7");
        thread.start();

        //static methods
        thread = new Thread(MicroTask::startMicroTasks);
        thread.setName("Thread-8");
        thread.start();
    }
}
