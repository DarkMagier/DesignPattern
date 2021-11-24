package com.DesignPattern.Factory.FactoryMethod.Pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("倫敦的奶酪披薩");
        System.out.println(name+"準備原材料！");
    }
}
