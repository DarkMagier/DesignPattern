package com.DesignPattern.TemplateMethold;

public class PureSoyMilk extends SoyMilk{
    private String name = "";
    @Override
    void addCondiments() {

    }

    @Override
    boolean customCondiments() {
        return false;
    }
}
