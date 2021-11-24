package com.DesignPattern.TemplateMethold;

public class RedBeanMilk extends SoyMilk{
    private String name = "紅豆";
    @Override
    void addCondiments() {
        System.out.println("加入上好的"+name);
    }
}
