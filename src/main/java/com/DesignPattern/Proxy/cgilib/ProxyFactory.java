package com.DesignPattern.Proxy.cgilib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    private Object target;
    //傳入被代理的對象
    public ProxyFactory(Object target) {
        this.target = target;
    }
    //返回一個代理對象，是target的代理類
    public Object getProxyInstance() {
        //1.創建一個工具類
        Enhancer enhancer = new Enhancer();
        //2.設置父類
        enhancer.setSuperclass(target.getClass());
        //3.設置返回值
        enhancer.setCallback(this);
        //4/創建子類對象--》代理對象
        return enhancer.create();
    }

    //重寫intercept 調用目標對象的相關方法
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib 代理模式開始");
        method.invoke(target,args );
        System.out.println("Cglib 代理對象提交");
        return null;
    }
}
