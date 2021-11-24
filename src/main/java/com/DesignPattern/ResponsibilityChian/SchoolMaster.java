package com.DesignPattern.ResponsibilityChian;

public class SchoolMaster extends Approve{
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()>=30000){
            System.out.println("請求編號 id="+purchaseRequest.getId()+"被"+this.name+"處理了");
        }else {
            approve.processRequest(purchaseRequest);
        }
    }

    public SchoolMaster(String name) {
        super(name);
    }
}
