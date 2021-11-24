package com.DesignPattern.Builder.Example;

public abstract class AbstractHouse {
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoof();
    public void build(){
        //缺點，沒有設計緩存層，把產品和產品建造的過程合在了一起，不利於維護
        buildBasic();
        buildWall();
        buildRoof();
    }
}
