package com.DesignPattern.ResponsibilityChian;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(0, 1, 33000, 1);

        DepartmentApprove departmentApprove = new DepartmentApprove("系主任");
        CollegeApprove collegeApprove = new CollegeApprove("院長");
        ViceSchoolMaster viceSchoolMaster = new ViceSchoolMaster("副校長");
        SchoolMaster schoolMaster = new SchoolMaster("校長");

        departmentApprove.setApprove(collegeApprove);
        collegeApprove.setApprove(viceSchoolMaster);
        viceSchoolMaster.setApprove(schoolMaster);


        departmentApprove.processRequest(purchaseRequest);


    }
}
