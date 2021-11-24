package com.DesignPattern.Adapter.ClassMethod;

public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V()==5){
            System.out.println("Voltage =5V, start charging!");
        }else if (iVoltage5V.output5V()>5){
            System.out.println("Voltage > 5V, cannot charging!");
        }
    }
}
