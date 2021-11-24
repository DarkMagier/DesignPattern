package com.DesignPattern.Factory.FactoryMethod.Pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的奶酪披薩");
        System.out.println(name+"準備原材料！");
    }
}
