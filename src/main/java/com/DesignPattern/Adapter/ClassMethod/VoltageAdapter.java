package com.DesignPattern.Adapter.ClassMethod;
//因為Java單繼承機制，需要繼承scr,會在adapter中暴露出來
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int srcV=ouput220V();
        int dstV=srcV/44;
        return dstV;
    }
}
