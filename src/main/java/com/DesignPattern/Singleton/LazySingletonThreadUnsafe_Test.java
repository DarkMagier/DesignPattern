package com.DesignPattern.Singleton;

public class LazySingletonThreadUnsafe_Test {
    public static void main(String[] args) {
        LazySingletonThreadUnsafe instance = LazySingletonThreadUnsafe.getInstance();
        LazySingletonThreadUnsafe instance1 = LazySingletonThreadUnsafe.getInstance();
        System.out.println(instance==instance1);
        System.out.println("instance.hashCode="+instance.hashCode());
        System.out.println("instance1.hashCode="+instance1.hashCode());

    }


}
class LazySingletonThreadUnsafe{
    private static LazySingletonThreadUnsafe instance;
    private LazySingletonThreadUnsafe(){

    }
    public static LazySingletonThreadUnsafe getInstance(){
        if(instance==null){
            instance=new LazySingletonThreadUnsafe();
        }
        return instance;
    }
}