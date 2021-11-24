package com.DesignPattern.Factory.FactoryMethod;

public class PizzaStore {
    //bj
    public static void main(String[] args) {
        String loc = "ld";
        if(loc.equals("bj")){
            new BJOrderPizza();
        }else if (loc.equals("ld")){
            new LDOrderPizza();
        }

    }
}
