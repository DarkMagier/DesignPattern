package com.DesignPattern.Decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink order = new NoneCoffee();

        // 1. longblack
        System.out.println("cost 1 >>"+order.cost());
        System.out.println("desc 1 >>"+order.getDescribe());

        // 2. add milk
        order=new Milk(order);
        System.out.println("cost 2 >>"+order.cost());
        System.out.println("desc 2 >>"+order.getDescribe());

        // 3. add chocolate
        order=new Chocolate(order);
        System.out.println("cost 3 >>"+order.cost());
        System.out.println("desc 3 >>"+order.getDescribe());


    }
}
