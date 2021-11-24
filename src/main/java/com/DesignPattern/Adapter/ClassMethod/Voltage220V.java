package com.DesignPattern.Adapter.ClassMethod;

public class Voltage220V {
    // output 220V
    public int ouput220V(){
        int src = 220;
        System.out.println("電壓="+src+"V");
        return src;
    }
}
