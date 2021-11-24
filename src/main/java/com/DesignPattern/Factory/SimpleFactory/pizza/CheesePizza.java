package com.DesignPattern.Factory.SimpleFactory.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("preparing for the cheese Pizza!");
    }
}
