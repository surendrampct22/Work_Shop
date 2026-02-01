package com.org.oop;

public class CompositionCar {
    private CompositionEngine engine; //Here is a strong association

    public CompositionCar(){
        engine = new CompositionEngine();
    }
    void drive(){
        engine.start();
        System.out.println("Car is driving");
        engine.stop();
        System.out.println("Car stopped");
    }

}
