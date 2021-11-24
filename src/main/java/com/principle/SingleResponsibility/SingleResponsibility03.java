package com.principle.SingleResponsibility;

public class SingleResponsibility03 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("car");
        vehicle2.runWater("ship");
        vehicle2.runAir("flight");
    }
}
//this method did not have a big modify in the original class. only add some function.
// Although it not comply the single Responsible principle in class-level, but in function-level.
class Vehicle2 {
    public void run(String vehicle){
        System.out.println(vehicle+" 在公路上運行。。。");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle+" 在天空上運行。。。");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle+" 在水中上運行。。。");
    }
}
