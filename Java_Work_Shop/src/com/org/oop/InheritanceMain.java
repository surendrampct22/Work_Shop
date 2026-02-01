package com.org.oop;

public class InheritanceMain {
    public static void main(String[] args) {
    InheritanceDog dog = new InheritanceDog();
    dog.ear();//Inherited method
    dog.eye();//Inherited method
    dog.bark();
        InheritanceAnimal dog1 = new InheritanceDog();
        dog1.ear();
        dog1.eye();
        //dog1.bark(); // if we try to access bark method it will throw an error because it is not inherited
    }
}
