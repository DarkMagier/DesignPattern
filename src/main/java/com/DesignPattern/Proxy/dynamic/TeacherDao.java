package com.DesignPattern.Proxy.dynamic;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老師正在授課");
    }
}
