package com.DesignPattern.Strategy;

public class WildDuck extends Duck{
    public WildDuck() {
        flyBehavior = new GoodFlyBehaviour();
    }

    @Override
    public void display() {
        System.out.println("野生鴨子！");
    }
}
