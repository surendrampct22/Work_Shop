package com.sp.org;

public class Main {
    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread1 = new Thread(runnableDemo);
        ThreadDemo thread2=new ThreadDemo();
        thread1.start();
        thread2.start();
    }
}
