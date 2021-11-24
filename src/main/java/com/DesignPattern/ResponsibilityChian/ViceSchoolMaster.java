package com.DesignPattern.ResponsibilityChian;

public class ViceSchoolMaster extends Approve{
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()>=10000&&purchaseRequest.getPrice()<=30000){
            System.out.println("請求編號 id="+purchaseRequest.getId()+"被"+this.name+"處理了");
        }else {
            approve.processRequest(purchaseRequest);
        }
    }

    public ViceSchoolMaster(String name) {
        super(name);
    }
}
