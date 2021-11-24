package com.DesignPattern.Facade;

public class PopCorn {
    //singleton
    private String name = "PopCorn";
    private static PopCorn instance = new PopCorn();
    public static PopCorn getInstance(){
        return instance;
    }
    public void on(){
        System.out.println(name+" on!");
    }
    public void off(){
        System.out.println(name+" off!");
    }
    public void pop(){
        System.out.println(name+" is popping!");
    }

}
