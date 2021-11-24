package com.DesignPattern.ResponsibilityChian;

public class CollegeApprove extends Approve{
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()>=5000&&purchaseRequest.getPrice()<=10000){
            System.out.println("請求編號 id="+purchaseRequest.getId()+"被"+this.name+"處理了");
        }else {
            approve.processRequest(purchaseRequest);
        }
    }

    public CollegeApprove(String name) {
        super(name);
    }
}
