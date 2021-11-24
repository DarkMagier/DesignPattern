package com.DesignPattern.Proxy;

public class TeacherDao implements com.DesignPattern.Proxy.ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老師正在授課");
    }
}
