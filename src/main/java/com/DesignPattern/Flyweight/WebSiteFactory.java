package com.DesignPattern.Flyweight;

import java.util.HashMap;

public class WebSiteFactory {
    private HashMap<String,ConcreteWebsite> pool=new HashMap<>();
    //根據網站類型返回一個網站，如果沒有就創建一個，放入池中並返回
    public WebSite getWebsiteConcrete(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebsite(type));

        }
        return pool.get(type);
    }
    public int getWebsiteCount(){
        return pool.size();
    }
}
