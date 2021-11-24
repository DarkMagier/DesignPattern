package com.DesignPattern.ResponsibilityChian;

public abstract class Approve {
    protected Approve approve; //next processer
    String name;

    public Approve(String name) {
        this.name = name;
    }

    public void setApprove(Approve approve) {
        this.approve = approve;
    }
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
