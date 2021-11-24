package com.DesignPattern.Facade;

public class Projector {
    //singleton
    private String name = "Projector    ";
    private static Projector instance = new Projector();
    public static Projector getInstance(){
        return instance;
    }
    public void on(){
        System.out.println(name+" on!");
    }
    public void off(){
        System.out.println(name+" off!");
    }
    public void focus(){
        System.out.println(name+" is focusing!");
    }
}
