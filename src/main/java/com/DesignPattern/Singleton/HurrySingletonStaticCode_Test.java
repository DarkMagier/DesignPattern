package com.DesignPattern.Singleton;


public class HurrySingletonStaticCode_Test {
    public static void main(String[] args) {
        HurrySingletonStaticCode instance = HurrySingletonStaticCode.getInstance();
        HurrySingletonStaticCode instance1 = HurrySingletonStaticCode.getInstance();
        System.out.println(instance==instance1);
        System.out.println("instance.hashCode="+instance.hashCode());
        System.out.println("instance1.hashCode="+instance1.hashCode());

    }
}
//餓漢式（靜態代碼）--與靜態變量模式沒有區別
//1.在裝載類的時候，就完成實例化，避免多線程的問題
//2。沒有達到lazy loading的效果，如果從頭到尾就沒有用過這個實例，則會造成浪費
class HurrySingletonStaticCode{
    private HurrySingletonStaticCode(){

    }
    private  static HurrySingletonStaticCode instance;
    static {//在靜態代碼塊中
        instance=new HurrySingletonStaticCode();
    }
    public static HurrySingletonStaticCode getInstance(){
        return instance;
    }
}
