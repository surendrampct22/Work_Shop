package com.org.oop;

public interface InterfaceDemo {
     public abstract void start();
     void  stop();


     //java 8 onwards we can add default and static methods
     default void run(){
        System.out.println("Running");
     }

     static void speed(){
        System.out.println("Over speed");
     }

}
