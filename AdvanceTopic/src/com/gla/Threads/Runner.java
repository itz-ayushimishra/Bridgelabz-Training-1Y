package com.gla.Threads;

public class Runner {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread thread=new Thread(t1);
        thread.start();
        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}
