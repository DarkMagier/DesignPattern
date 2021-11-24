package com.principle.SingleResponsibility;

public class SingleResponsibility01 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("moto");
        vehicle.run("car");
        vehicle.run("flight");
    }

}
//analysis the problem of method #1
//1. in the method #1, it is violated the principle of single responsible.
class Vehicle {
    public void run(String vehicle){
        System.out.println(vehicle+" 在公路上運行。。。");
    }
}
