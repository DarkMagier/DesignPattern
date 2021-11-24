package com.DesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

//University is the class of OrganizationComponent, use to manage College.
public class University extends OrganizationComponent{
    List<OrganizationComponent>organizationComponents=new ArrayList<OrganizationComponent>();
    public University(String name, String describe) {
        super(name, describe);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
//        super.add(organizationComponent);
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
//        super.remove(organizationComponent);
        organizationComponents.remove(organizationComponent);
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
        System.out.println("--------"+getName()+"--------");
        for (OrganizationComponent organizationComponent:organizationComponents){
            organizationComponent.print();
        }
    }
}
