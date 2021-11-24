package com.DesignPattern.Factory.SimpleFactory;

import com.DesignPattern.Factory.SimpleFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza2 {
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
    Pizza pizza=null;
    String orderType = null;
    public OrderPizza2(SimpleFactory simpleFactory){
//        setSimpleFactory(simpleFactory);
        do {
            orderType=getType();
            pizza=SimpleFactory.createPizza(orderType);
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
