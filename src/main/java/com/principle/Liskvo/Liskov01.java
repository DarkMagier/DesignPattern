package com.principle.Liskvo;

public class Liskov01 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.function1(11,3));
        System.out.println("1-8="+a.function1(1,8));


        B b = new B();
        //function1 is the rewrite version.
        System.out.println("11-3="+b.function1(11,3));
        System.out.println("1-8="+b.function1(1,8));
    }
}
class A{
    public int function1(int num1,int num2){
        return num1-num2;
    }
}
class B extends A{
    //in here rewrite the function1
    public int function1(int num1, int num2){
        return num1+num2;
    }
    public int function2(int a,int b){
        return function1(a,b)+1;
    }
}