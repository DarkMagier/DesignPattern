package com.DesignPattern.Builder.Builder;

public class HouseDirector {
    HouseBuilder houseBuilder=null;

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
//構造器傳入 houseBuilder
    //或用settera方法

    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }
    public House constructHouse(){
        //流程由HouseDirector決定
        houseBuilder.buildBase();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
