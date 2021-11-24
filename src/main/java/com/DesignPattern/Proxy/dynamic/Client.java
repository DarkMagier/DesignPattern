package com.DesignPattern.Proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
        System.out.println("ProxyInstance = "+proxyInstance.getClass());
    }

}
