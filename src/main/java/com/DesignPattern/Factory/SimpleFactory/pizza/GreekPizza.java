package com.DesignPattern.Factory.SimpleFactory.pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("preparing for the Greek Pizza!");
    }
}