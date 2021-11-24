package com.DesignPattern.Adapter.InterfaceAdapter;

public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter=new AbsAdapter(){
            //只需要重寫需要使用的方法

            @Override
            public void m1() {
                super.m1();
                System.out.println("正在使用M1方法");
            }
        };
        absAdapter.m1();
    }
}
