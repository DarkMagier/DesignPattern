package com.DesignPattern.Builder.Builder;

public abstract class HouseBuilder {
    protected House house=new House();

    //建造流程的抽象方法寫好
    public abstract void buildBase();
    public abstract void buildWall();
    public abstract void roofed();


    public House buildHouse(){
        //房子建造好後，返回這個房子。
        return house;
    }
}
