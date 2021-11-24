package com.DesignPattern.Decorator;
//這裏是調味品
public class Chocolate extends Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        setDescribe("Chocolate");
        setPrice(3.0f);
    }
}
