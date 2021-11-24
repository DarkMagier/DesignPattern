package com.DesignPattern.Strategy;

public class PekingDuck extends Duck{
    public PekingDuck() {
        flyBehavior = new BadFlyBehaviour();
    }

    @Override
    public void display() {
        System.out.println("北京鴨子！");
    }
}
