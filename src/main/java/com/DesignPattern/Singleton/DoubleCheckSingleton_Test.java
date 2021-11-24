package com.DesignPattern.Singleton;

public class DoubleCheckSingleton_Test {
    public static void main(String[] args) {
        DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton instance1 = DoubleCheckSingleton.getInstance();
        System.out.println(instance==instance1);
        System.out.println("instance.hashCode="+instance.hashCode());
        System.out.println("instance1.hashCode="+instance1.hashCode());
    }
}
class DoubleCheckSingleton {
    //每次读取前必须先从主内存刷新最新的值。
    //每次写入后必须立即同步回主内存当中。
    //也就是说，volatile关键字修饰的变量看到的随时是自己的最新值。线程1中对变量v的最新修改，对线程2是可见的。
    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {

    }


    public static synchronized DoubleCheckSingleton getInstance() {
            //C和D檢測時候已經創建實例，在無法進入if
            if (instance == null) {
                //假如A和B同時進入，A進入後，B被卡在這裏
                synchronized (DoubleCheckSingleton.class) {
                    //A創建完了走了，B進入之後，instance已經創建，無法進入if。
                    if (instance == null) {

                        instance = new DoubleCheckSingleton();
                    }
            }
        }

        return instance;
    }
}