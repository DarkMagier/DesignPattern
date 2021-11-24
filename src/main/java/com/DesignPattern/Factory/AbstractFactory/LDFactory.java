package com.DesignPattern.Factory.AbstractFactory;

import com.DesignPattern.Factory.AbstractFactory.Pizza.*;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("using abs factory mode!");
        Pizza pizza =null;
        if(orderType.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
