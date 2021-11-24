package com.DesignPattern.Adapter.ClassMethod;

public class Client {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.charging(new VoltageAdapter());
        phone.charging(new VoltageAdapter2(new Voltage220V()));
    }


}
