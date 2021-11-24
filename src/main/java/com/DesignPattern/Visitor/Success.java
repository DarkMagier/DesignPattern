package com.DesignPattern.Visitor;

public class Success extends Action{


    @Override
    void getManResult(Man man) {
        System.out.println("Man - Success");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println("Woman - Success");
    }
}
