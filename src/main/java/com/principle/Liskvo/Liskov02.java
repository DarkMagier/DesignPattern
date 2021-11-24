package com.principle.Liskvo;

public class Liskov02 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        System.out.println("11-3="+a1.function1(11,3));
        System.out.println("1-8="+a1.function1(1,8));


        B1 b1 = new B1();
        //因為B1不再繼承A1類，所以調用者不再認為是求減法
        System.out.println("11+3="+b1.function1(11,3));
        System.out.println("1+8="+b1.function1(1,8));

        //仍可以使用A類的方法
        System.out.println("11-3="+b1.function3(11,3));
    }
}
class Base{
    //更加基礎的方法和成員寫到這裏

}
class A1 extends Base{
    public int function1(int num1,int num2){
        return num1-num2;
    }
}
class B1 extends Base{
    //如果B1需要使用A1類的方法，使用組合關係
    private A1 a1=new A1();
    public int function1(int num1, int num2){
        return num1+num2;
    }
    public int function2(int a,int b){
        return function1(a,b)+1;
    }
    public int function3(int a,int b){
        return this.a1.function1(a,b);
    }
}