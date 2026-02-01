package com.org.oop;

abstract class AbstractionDemoShape {

    abstract void draw();
    void color(){
        System.out.println("Coloring the shape");
    }
    public static void fill(){
        System.out.println("Filling the shape");
    }
}
