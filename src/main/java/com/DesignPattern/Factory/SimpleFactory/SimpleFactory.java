package com.DesignPattern.Factory.SimpleFactory;

import com.DesignPattern.Factory.SimpleFactory.pizza.CheesePizza;
import com.DesignPattern.Factory.SimpleFactory.pizza.GreekPizza;
import com.DesignPattern.Factory.SimpleFactory.pizza.PepperPizza;
import com.DesignPattern.Factory.SimpleFactory.pizza.Pizza;

public class SimpleFactory {
    //使用靜態更為方便
    public static Pizza createPizza(String orderType){
        Pizza pizza=null;
        System.out.println("使用簡單工廠模式");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
        }else if(orderType.equals("cheese")){
            pizza=new CheesePizza();
        }else if(orderType.equals("pepper")){
            pizza=new PepperPizza();
        }
        if(pizza!=null){
            pizza.setName(orderType);
        }
        return pizza;
    }
}
