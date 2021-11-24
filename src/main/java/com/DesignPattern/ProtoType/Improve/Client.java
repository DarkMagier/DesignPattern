package com.DesignPattern.ProtoType.Improve;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",1,"white");
        Sheep clone =(Sheep) sheep.deepClone();
    }
}
