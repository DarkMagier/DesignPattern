package com.DesignPattern.Factory.AbstractFactory;

import com.DesignPattern.Factory.AbstractFactory.Pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory factory;
    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }
    private void setFactory(AbsFactory factory){
        this.factory=factory;
        Pizza pizza=null;
        String orderType="";
        do{
            orderType =getType();
            //factory 可能是北京的也可能是倫敦的
            pizza=factory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("訂購失敗");
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
