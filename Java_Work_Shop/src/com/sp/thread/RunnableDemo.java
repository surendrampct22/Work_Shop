package com.sp.thread;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        for(int i= 1;i <= 5; i++){
            System.out.println("It is a Runnable class thread");
        }

    }
}
