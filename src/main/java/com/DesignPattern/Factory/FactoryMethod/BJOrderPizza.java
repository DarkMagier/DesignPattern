package com.DesignPattern.Factory.FactoryMethod;

import com.DesignPattern.Factory.FactoryMethod.Pizza.BJCheesePizza;
import com.DesignPattern.Factory.FactoryMethod.Pizza.BJPepperPizza;
import com.DesignPattern.Factory.FactoryMethod.Pizza.Pizza;


public class BJOrderPizza extends OrderPizza{

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}
