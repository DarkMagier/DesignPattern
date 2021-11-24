package com.DesignPattern.Decorator;
//這裏是調味品
public class Milk extends Decorator{

    public Milk(Drink obj) {
        super(obj);
        setDescribe("Milk");
        setPrice(2.0f);
    }
}
