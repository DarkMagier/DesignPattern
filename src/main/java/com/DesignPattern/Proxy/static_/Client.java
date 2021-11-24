package com.DesignPattern.Proxy;

public class Client {
    public static void main(String[] args) {
        com.DesignPattern.Proxy.TeacherDao teacherDao = new com.DesignPattern.Proxy.TeacherDao();

        com.DesignPattern.Proxy.TeacherDaoProxy teacherDaoProxy = new com.DesignPattern.Proxy.TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}
