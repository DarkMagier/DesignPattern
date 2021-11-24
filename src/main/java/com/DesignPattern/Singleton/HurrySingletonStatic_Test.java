package com.DesignPattern.Singleton;

public class HurrySingletonStatic_Test {
    public static void main(String[] args) {
        HurrySingletonStatic instance = HurrySingletonStatic.getInstance();
        HurrySingletonStatic instance1 = HurrySingletonStatic.getInstance();
        System.out.println(instance==instance1);
        System.out.println("instance.hashCode="+instance.hashCode());
        System.out.println("instance1.hashCode="+instance1.hashCode());

    }
}
//餓漢式（靜態變量）
//1.在裝載類的時候，就完成實例化，避免多線程的問題
//2。沒有達到lazy loading的效果，如果從頭到尾就沒有用過這個實例，則會造成浪費
class HurrySingletonStatic{
    private HurrySingletonStatic(){

    }
    private final static HurrySingletonStatic instance = new HurrySingletonStatic();

    public static HurrySingletonStatic getInstance(){
        return instance;
    }
}
