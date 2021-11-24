package com.DesignPattern.Facade;

public class Screen {
    //singleton
    private String name = "Screen";
    private static Screen instance = new Screen();
    public static Screen getInstance(){
        return instance;
    }
    public void up(){
        System.out.println(name+" up!");
    }
    public void down(){
        System.out.println(name+" down!");
    }

}


