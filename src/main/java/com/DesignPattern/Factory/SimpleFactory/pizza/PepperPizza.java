package com.DesignPattern.Factory.SimpleFactory.pizza;

public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("preparing for the pepper Pizza!");
    }
}
