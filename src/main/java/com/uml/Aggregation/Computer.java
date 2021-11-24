package com.uml.Aggregation;

public class Computer {
    private Mouse mouse=new Mouse();//鼠標和電腦不可分離，共生，為組合關係。
    private Monitor monitor; //顯示器可以和電腦分離-》聚合關係


    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
