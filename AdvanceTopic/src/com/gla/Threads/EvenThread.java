package com.gla.Threads;

public class EvenThread implements Runnable {
    @Override
    public void run() {
        for(int j = 2; j <= 10; j+=2) {
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
