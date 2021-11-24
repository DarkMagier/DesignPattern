package com.DesignPattern.ProtoType.Example;

public class Client {
    public static void main(String[] args) {
        Sheep sheep=new Sheep("tom",1,"白色");
        new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
    }
}
