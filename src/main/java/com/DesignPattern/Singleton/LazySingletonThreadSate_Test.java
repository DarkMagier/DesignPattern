package com.DesignPattern.Singleton;

public class LazySingletonThreadSate_Test {
    public static void main(String[] args) {
        LazySingletonThreadSafe instance = LazySingletonThreadSafe.getInstance();
        LazySingletonThreadSafe instance1 = LazySingletonThreadSafe.getInstance();
        System.out.println(instance==instance1);
        System.out.println("instance.hashCode="+instance.hashCode());
        System.out.println("instance1.hashCode="+instance1.hashCode());
    }
}
class LazySingletonThreadSafe{
    private static LazySingletonThreadSafe instance;
    private LazySingletonThreadSafe(){

    }
    //synchronized同步處理
    //效率變低了，只實例化一次，但是每次get的時候都要同步，效率低
    public static synchronized LazySingletonThreadSafe getInstance(){
        if(instance==null){
            instance=new LazySingletonThreadSafe();
        }


        return instance;
    }
    //如果採用同步代碼塊模式是無法實現線程安全的
//    public static  LazySingletonThreadSafe getInstance(){
//        if(instance==null){//在判斷是，多個線程已經進來了。線程不安全，第一個線程創建完了，第二個進來的還會創建一個。
//            synchronized (LazySingletonThreadSafe.class){instance=new LazySingletonThreadSafe();}
//        }
//
//
//        return instance;
//    }
}