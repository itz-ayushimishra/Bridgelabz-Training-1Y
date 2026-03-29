package com.gla.mutithreading;

public class Runner {
    public static void main(String[] args){
        A a1 = new A();
        a1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        B b1 = new B();
        b1.start();
    }
}
