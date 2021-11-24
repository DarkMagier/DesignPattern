package com.DesignPattern.Factory.Example;

import com.DesignPattern.Factory.Example.pizza.CheesePizza;
import com.DesignPattern.Factory.Example.pizza.GreekPizza;
import com.DesignPattern.Factory.Example.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza(){
        Pizza pizza = null;
        String orderType;
        do{
            orderType=getType();
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
            }else if(orderType.equals("cheese")){
                pizza=new CheesePizza();
            }else {
                break;
            }
        }while (true);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();
    }
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
