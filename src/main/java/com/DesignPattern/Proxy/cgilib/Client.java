package com.DesignPattern.Proxy.cgilib;

public class Client {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        TeacherDao proxyInstance =(TeacherDao) new ProxyFactory(target).getProxyInstance();

        //出發intecept方法 從而實現對目標對象的調用
        proxyInstance.teach();
    }
}
