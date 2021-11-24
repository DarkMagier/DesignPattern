package com.DesignPattern.Proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        //對target進行初始化
        this.target = target;
    }
    public Object getProxyInstance(){
        //說明
        //ClassLoader: 當前目標對象使用的類加載器，獲取加載器方法固定
        // Class<?>[] interfaces 目標對象實現的接口類型，使用泛型的方法
        //InvocationHandler h 執行目標對象的方法時，會出發事件的處理器方法，會把當前執行目標對象的方法作為參數傳入
//        public static Object newProxyInstance(ClassLoader loader,
//                Class<?>[] interfaces,
//                InvocationHandler h)

            return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            System.out.println("jdk 代理開始");
                            //反射機制，調用目標對象的方法
                            Object returnVal = method.invoke(target, args);
                            System.out.println("JDK 代理提交");
                            return returnVal;
                        }
                    }
            );
    }
}
