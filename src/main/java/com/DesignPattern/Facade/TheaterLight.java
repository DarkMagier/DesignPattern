package com.DesignPattern.Facade;

public class TheaterLight {
    //singleton
    private String name = "TheaterLight";
    private static TheaterLight instance = new TheaterLight();
    public static TheaterLight getInstance(){
        return instance;
    }
    public void on(){
        System.out.println(name+" on!");
    }
    public void off(){
        System.out.println(name+" off!");
    }
    public void bright(){
        System.out.println(name+" is bright!");
    }
    public void dim(){
        System.out.println(name+" dim !");
    }
}
