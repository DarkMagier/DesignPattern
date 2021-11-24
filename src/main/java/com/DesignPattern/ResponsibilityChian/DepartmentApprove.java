package com.DesignPattern.ResponsibilityChian;

public class DepartmentApprove extends Approve{
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()<=5000){
            System.out.println("請求編號 id="+purchaseRequest.getId()+"被"+this.name+"處理了");
        }else {
            approve.processRequest(purchaseRequest);
        }
    }

    public DepartmentApprove(String name) {
        super(name);
    }
}
