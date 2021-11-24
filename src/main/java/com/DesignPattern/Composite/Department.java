package com.DesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

//University is the class of OrganizationComponent, use to manage College.
public class Department extends OrganizationComponent{
   public Department(String name, String describe) {
        super(name, describe);
    }



    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getDescribe() {
        return super.getDescribe();
    }

    @Override
    public void setDescribe(String describe) {
        super.setDescribe(describe);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
