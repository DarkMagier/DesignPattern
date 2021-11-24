package com.DesignPattern.Bridge;
//折疊式手機的類
public class UpRightPhone extends Phone{
    private String name="直板手機";
    public UpRightPhone(Brand brand) {
        super(brand);
    }
    public void open(){
        super.open();
        System.out.println(name);
    }
    public void close(){
        super.close();
        System.out.println(name);
    }
    public void call(){
        super.call();
        System.out.println(name);
    }
}
