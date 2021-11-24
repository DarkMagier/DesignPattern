package com.principle.DependenceInverse;

public class DependencyInverse2 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.receive(new Email1());
        person1.receive(new Weixin());
    }


}
interface IReceiver {
    public String getInfo();
}
class Email1 implements IReceiver{
    public String getInfo(){
        return "email:message>> hello,world!";
    }
}
class Weixin implements IReceiver{
    public String getInfo(){
        return "weixin:message>> hello,world!";
    }
}
class Person1{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}