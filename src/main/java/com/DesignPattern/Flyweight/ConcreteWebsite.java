package com.DesignPattern.Flyweight;

public class ConcreteWebsite  extends WebSite{
    private String type = "";//網站發布類型

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("網站的發布形式為："+type+", 使用者:"+user.getName());
    }

}
