package com.DesignPattern.Factory.AbstractFactory.Pizza;

import com.DesignPattern.Factory.AbstractFactory.Pizza.Pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("倫敦的胡椒披薩");
        System.out.println(name+"準備原材料！");
    }
}
