package com.DesignPattern.Decorator;

public class Decorator extends Drink{
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //getPrice() self's price
        return super.getPrice() + obj.cost();
    }

    public String getDescribe() {
        return super.getDescribe()+" "+super.getPrice()+"&&"+obj.getDescribe()+" "+obj.getPrice();
    }

}
