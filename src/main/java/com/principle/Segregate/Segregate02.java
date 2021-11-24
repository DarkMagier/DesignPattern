package com.principle.Segregate;

public class Segregate02 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.depend1(new B1());
        a1.depend2(new B1());
        a1.depend3(new B1());

        C1 c1 = new C1();
        c1.depend1(new B1());
        c1.depend4(new D1());
        c1.depend5(new D1());

        B1 b1=new B1();
        a1.depend1(b1);
    }
}
interface Interface01{
    void operation1();

    void operation4();
    void operation5();

}
interface Interface02{

    void operation2();
    void operation3();
}
interface Interface03{

    void operation4();
    void operation5();
}
class B1 implements Interface01,Interface02{
    private final String name="Class B1";
    @Override
    public void operation1() {
        System.out.println(name+" 實現了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println(name+" 實現了 operation2");

    }

    @Override
    public void operation3() {
        System.out.println(name+" 實現了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println(name+" 實現了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println(name+" 實現了 operation5");
    }
}

class D1 implements Interface01,Interface03{
    private final String name="Class D1";
    @Override
    public void operation1() {
        System.out.println(name+" 實現了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println(name+" 實現了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println(name+" 實現了 operation5");
    }
}

class A1 {
    public void depend1(Interface01 interface01){
        interface01.operation1();
    }
    public void depend2(Interface02 interface02){
        interface02.operation2();
    }
    public void depend3(Interface02 interface1){
        interface1.operation3();
    }
}
class C1 {
    public void depend1(Interface01 interface1){
        interface1.operation1();
    }
    public void depend4(Interface03 interface1){
        interface1.operation4();
    }
    public void depend5(Interface03 interface1){
        interface1.operation5();
    }
}