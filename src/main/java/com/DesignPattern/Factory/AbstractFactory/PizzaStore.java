package com.DesignPattern.Factory.AbstractFactory;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }
}
