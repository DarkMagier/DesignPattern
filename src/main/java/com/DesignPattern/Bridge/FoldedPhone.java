package com.DesignPattern.Bridge;
//折疊式手機的類
public class FoldedPhone extends Phone{
    private String name="折疊手機";
    public FoldedPhone(Brand brand) {
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
