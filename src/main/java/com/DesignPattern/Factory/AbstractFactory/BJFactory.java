package com.DesignPattern.Factory.AbstractFactory;

import com.DesignPattern.Factory.AbstractFactory.Pizza.BJCheesePizza;
import com.DesignPattern.Factory.AbstractFactory.Pizza.BJPepperPizza;
import com.DesignPattern.Factory.AbstractFactory.Pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("using abs factory mode!");
        Pizza pizza =null;
        if(orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
