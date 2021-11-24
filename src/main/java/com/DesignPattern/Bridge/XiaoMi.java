package com.DesignPattern.Bridge;

public class XiaoMi implements Brand{
    private String name="小米手機";
    @Override
    public void open() {
        System.out.println(name+"開機");
    }

    @Override
    public void close() {
        System.out.println(name+"關機");
    }

    @Override
    public void call() {
        System.out.println(name+"打電話");
    }
}
