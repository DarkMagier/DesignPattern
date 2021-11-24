package com.DesignPattern.Facade;

public class Stereo {
    //singleton
    private String name = "Stereo";
    private static Stereo instance = new Stereo();
    public static Stereo getInstance(){
        return instance;
    }
    public void on(){
        System.out.println(name+" on!");
    }
    public void off(){
        System.out.println(name+" off!");
    }
    public void up(){
        System.out.println(name+" is up!");
    }
    public void down(){
        System.out.println(name+" is down !");
    }
}
