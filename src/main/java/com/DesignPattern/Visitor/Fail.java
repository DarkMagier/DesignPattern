package com.DesignPattern.Visitor;

public class Fail extends Action{

    @Override
    void getManResult(Man man) {
        System.out.println("Man - Fail");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println("Woman - Fail");
    }
}
