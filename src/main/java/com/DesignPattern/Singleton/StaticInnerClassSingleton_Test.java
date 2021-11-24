package com.DesignPattern.Singleton;

public class StaticInnerClassSingleton_Test {
    public static void main(String[] args) {

    }
}
class StaticInnerClassSingleton{
    private StaticInnerClassSingleton(){

    }
    //Singleton裝載時候，內部靜態類不會被裝載。可以保證lazy模式
    //JVM裝載類的時候，是保證線程安全的，所以能夠保證線程安全
    private static class StaticInnerClassSingletonInstance{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return StaticInnerClassSingletonInstance.INSTANCE;
    }
}