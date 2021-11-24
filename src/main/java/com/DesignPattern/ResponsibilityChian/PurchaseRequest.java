package com.DesignPattern.ResponsibilityChian;

public class PurchaseRequest {
    private int type =0;
    private int number=0;
    private float price = 0.0f;
    private int id=0;

    public PurchaseRequest(int type, int number, float price, int id) {
        this.type = type;
        this.number = number;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
