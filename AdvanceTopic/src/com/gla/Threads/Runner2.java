package com.gla.Threads;

public class Runner2 {
    public static void main(String[] args){
        OddThread o1 = new OddThread();
        Thread thread = new Thread(o1);
        EvenThread e1 = new EvenThread();
        Thread thread1 = new Thread(e1);
        thread.start();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        thread1.start();
    }
}
