package com.DesignPattern.Builder.Example;

public class CommonHouse extends AbstractHouse{

    @Override
    public void buildBasic() {
        System.out.println("給普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("給普通房子砌牆");
    }

    @Override
    public void buildRoof() {
        System.out.println("給普通房子封頂");
    }
}
