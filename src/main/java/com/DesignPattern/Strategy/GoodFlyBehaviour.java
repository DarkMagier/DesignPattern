package com.DesignPattern.Strategy;

public class GoodFlyBehaviour implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飛翔技術高超！");
    }
}
