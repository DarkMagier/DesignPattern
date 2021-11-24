package com.DesignPattern.Composite;

public abstract class OrganizationComponent {
    private String name;
    private String describe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public OrganizationComponent(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    protected void add(OrganizationComponent organizationComponent){
        //默認實現
        //不用抽象，這是葉子節點，如果抽象，所有葉子節點都要重寫
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationComponent organizationComponent){
        //默認實現
        //不用抽象，這是葉子節點，如果抽象，所有葉子節點都要重寫
        throw new UnsupportedOperationException();
    }

    //print-->abstract
    protected abstract void print();
}
