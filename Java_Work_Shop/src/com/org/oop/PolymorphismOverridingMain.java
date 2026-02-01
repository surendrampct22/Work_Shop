package com.org.oop;

public class PolymorphismOverridingMain {
    public static void main(String[] args) {
        PolymorphismOverridingHuman human = new PolymorphismOverridingMen();
        human.sleep();
        PolymorphismOverridingHuman human1 = new PolymorphismOverridingWomen();
        human1.sleep();
        PolymorphismOverridingHuman human2 = new PolymorphismOverridingHuman();
        human2.sleep();
        PolymorphismOverridingHuman human3 = new PolymorphismOverridingMen();
        human3.sleep();
        PolymorphismOverridingHuman human4 = new PolymorphismOverridingWomen();
        human4.sleep();

    }
}
