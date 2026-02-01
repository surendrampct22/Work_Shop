package com.org.oop;

public class PolymorphismOverloading {

    int add(int a,int b){//Two parameters
        return a+b ;
    }
    int add(int a,int b, int c){//Three parameters
        return a+b+c;
    }
    public static void main(String[] args) {
        PolymorphismOverloading obj = new PolymorphismOverloading();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
    }
}
