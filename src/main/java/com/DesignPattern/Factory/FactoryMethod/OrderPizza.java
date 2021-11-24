package com.DesignPattern.Factory.FactoryMethod;




import com.DesignPattern.Factory.FactoryMethod.Pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    abstract Pizza createPizza(String orderType);

    Pizza pizza=null;
    public OrderPizza(){
        String orderType = null;
        do {
            orderType=getType();
            pizza=createPizza(orderType);
            if (pizza != null){
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
