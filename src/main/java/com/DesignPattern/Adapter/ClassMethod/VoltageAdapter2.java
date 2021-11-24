package com.DesignPattern.Adapter.ClassMethod;
//因為Java單繼承機制，需要繼承scr,會在adapter中暴露出來
public class VoltageAdapter2  implements IVoltage5V{
    private Voltage220V voltage220V;
    public VoltageAdapter2(Voltage220V voltage220V){
        this.voltage220V=voltage220V;
    }
    @Override
    public int output5V() {
        int srcV=voltage220V.ouput220V();
        int dstV=srcV/44;
        return dstV;
    }
}
