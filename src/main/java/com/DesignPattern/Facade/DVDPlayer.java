package com.DesignPattern.Facade;

public class DVDPlayer {
    //singleton
    private String name = "DVD";
    private static  DVDPlayer instance = new DVDPlayer();
    public static DVDPlayer getInstance(){
        return instance;
    }
    public void on(){
        System.out.println(name+" on!");
    }
    public void off(){
        System.out.println(name+" off!");
    }
    public void play(){
        System.out.println(name+" is playing!");
    }
    public void pause(){
        System.out.println(name+" pause !");
    }
}
