package com.DesignPattern.Builder.Builder;

public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBase() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子建牆10米");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子蓋普通房子的屋頂");
    }
}
