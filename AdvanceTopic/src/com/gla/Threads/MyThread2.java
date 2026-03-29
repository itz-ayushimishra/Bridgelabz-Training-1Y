package com.gla.Threads;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        for(int j=0;j<=10;j++){
            System.out.println(j);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
