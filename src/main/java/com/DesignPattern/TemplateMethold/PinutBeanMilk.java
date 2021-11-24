package com.DesignPattern.TemplateMethold;

public class PinutBeanMilk extends SoyMilk{
    private String name = "花生";
    @Override
    void addCondiments() {
        System.out.println("加入上好的"+name);
    }
}
