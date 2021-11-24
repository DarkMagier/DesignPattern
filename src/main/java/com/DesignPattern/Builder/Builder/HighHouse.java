package com.DesignPattern.Builder.Builder;

public class HighHouse extends HouseBuilder{
    @Override
    public void buildBase() {
        System.out.println("高樓打地基10米");
    }

    @Override
    public void buildWall() {
        System.out.println("高樓建牆30米");
    }

    @Override
    public void roofed() {
        System.out.println("高樓蓋高樓的屋頂");
    }
}
