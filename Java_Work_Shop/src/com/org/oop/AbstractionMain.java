package com.org.oop;

public class AbstractionMain {
    public static void main(String[] args) {
        //Hiding the internal detail just show to service
        AbstractionDemoShape shape = new AbstractDemoCricle();
        shape.draw();
        AbstractionDemoShape shape2 = new AbstractionDemoRectangle();
        shape2.draw();
    }
}
