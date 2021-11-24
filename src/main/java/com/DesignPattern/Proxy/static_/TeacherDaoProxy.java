package com.DesignPattern.Proxy;

public class TeacherDaoProxy implements com.DesignPattern.Proxy.ITeacherDao {
    private com.DesignPattern.Proxy.ITeacherDao target;//目標代理對象，通過接口來聚合

    public TeacherDaoProxy(com.DesignPattern.Proxy.ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("starting proxy");
        target.teach();
        System.out.println("submit");
    }
}
