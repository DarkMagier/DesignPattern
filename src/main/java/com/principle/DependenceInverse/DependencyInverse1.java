package com.principle.DependenceInverse;

public class DependencyInverse1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
class Email{
public String getInfo(){
    return "email:message>> hello,world!";
}
}
//完成person接收消息的功能
//easy to implements.
//if we need to receive more, we need new Class, at mean time, we need to add method in person.
//introduce in a absort interface IReceiver, the Class Person depend on the IReceiver.

class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}