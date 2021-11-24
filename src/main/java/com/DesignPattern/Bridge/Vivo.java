package com.DesignPattern.Bridge;

public class Vivo implements Brand{
    private String name="Vivo手機";
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
