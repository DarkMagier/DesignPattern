package com.DesignPattern.Strategy;

public class ToyDuck extends Duck{
    public ToyDuck() {
        flyBehavior = new NoFlyBehaviour();
    }

    @Override
    public void display() {
        System.out.println("玩具鴨子！");
    }
}
