package com.DesignPattern.Factory.Example.pizza;

public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("preparing for the cheese Pizza!");
    }
}
