package com.DesignPattern.Factory.AbstractFactory.Pizza;

import com.DesignPattern.Factory.AbstractFactory.Pizza.Pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒披薩");
        System.out.println(name+"準備原材料！");
    }
}
