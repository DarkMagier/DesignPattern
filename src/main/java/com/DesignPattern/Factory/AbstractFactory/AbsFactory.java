package com.DesignPattern.Factory.AbstractFactory;

import com.DesignPattern.Factory.AbstractFactory.Pizza.Pizza;

//一個工廠模式的抽象層
public interface AbsFactory {
    //另下面的工廠子類進行具體的實現
    public Pizza createPizza(String orderType);
}
