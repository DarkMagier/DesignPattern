package com.DesignPattern.Factory.SimpleFactory;

import com.DesignPattern.Factory.SimpleFactory.pizza.CheesePizza;
import com.DesignPattern.Factory.SimpleFactory.pizza.GreekPizza;
import com.DesignPattern.Factory.SimpleFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
//    public OrderPizza(){
//        Pizza pizza = null;
//        String orderType;
//        do{
//            orderType=getType();
//
//        }while (true);
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.bake();
//    }
    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }
    SimpleFactory simpleFactory;
    Pizza pizza=null;
    public void setSimpleFactory(SimpleFactory simpleFactory){
        this.simpleFactory=simpleFactory;
        String orderType = null;
        do {
            orderType=getType();
            pizza=this.simpleFactory.createPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("訂購披薩失敗");
                break;
            }
        }while (true);
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
