package com.DesignPattern.Decorator;
//這裏是調味品
public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        setDescribe("Soy");
        setPrice(1.5f);
    }
}
