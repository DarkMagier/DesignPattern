package com.DesignPattern.Singleton;

public class EnumSingleton_Test {
    public static void main(String[] args) {
        EnumSingleton instance=EnumSingleton.INSTANCE;
        EnumSingleton instance1=EnumSingleton.INSTANCE;
        System.out.println(instance==instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
enum EnumSingleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok~");
    }
}