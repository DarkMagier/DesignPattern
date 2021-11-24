package com.DesignPattern.Factory.SimpleFactory;

public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
        System.out.println("退出程序！");
    }
}
