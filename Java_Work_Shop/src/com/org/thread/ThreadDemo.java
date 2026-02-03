package com.org.thread;

public class ThreadDemo extends Thread {
    @Override
    public void run() {
       for(int i=1; i<=5; i++){
           System.out.println("It is a thread class thread");
        }
    }

}
