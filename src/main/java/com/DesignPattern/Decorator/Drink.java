package com.DesignPattern.Decorator;

public abstract class Drink {
    public String describe;
    private float price = 0.0f;

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //calculate the price--abstract
    public abstract float cost();
}
