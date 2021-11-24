package com.principle.Segregate;

class Segregate01{
    public static void main(String[] args) {
        B b = new B();
        b.operation1();
    }
}
interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
    void operation6();
}

class B implements Interface1{
    private final String name="Class B";
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

    @Override
    public void operation6() {
        System.out.println(name+" 實現了 operation6");
    }
}
class D implements Interface1{
    private final String name="Class D";
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

    @Override
    public void operation6() {
        System.out.println(name+" 實現了 operation6");
    }
}

class A {
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void depend2(Interface1 interface1){
        interface1.operation2();
    }
    public void depend3(Interface1 interface1){
        interface1.operation3();
    }
}
class C {
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void depend4(Interface1 interface1){
        interface1.operation4();
    }
    public void depend5(Interface1 interface1){
        interface1.operation5();
    }
}