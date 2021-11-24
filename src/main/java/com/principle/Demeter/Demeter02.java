package com.principle.Demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter02 {
    public static void main(String[] args) {
        SchoolManager1 schoolManager1 = new SchoolManager1();
        schoolManager1.printAllEmployee1(new CollegeManager1());
    }
}
//總部員工
class Employee1{
    private String id;

    public void setId(String id) {
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
}

//學院的員工
class CollegeEmployee1{
    private String id;

    public void setId(String id) {
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
}
class CollegeManager1{
    public List<CollegeEmployee1> getAllCollegeEmployee1(){
        List<CollegeEmployee1> collegeEmployee1List=new ArrayList<CollegeEmployee1>();
        for (int i=0;i<10;i++){
            CollegeEmployee1 collegeEmployee1=new CollegeEmployee1();
            collegeEmployee1.setId("學院員工id="+i);
            collegeEmployee1List.add(collegeEmployee1);
        }
        return collegeEmployee1List;
    }
    public void printCollegeEmployee1(){
        List<CollegeEmployee1> allCollegeEmployee1 = getAllCollegeEmployee1();
        System.out.println("*****"+"學院員工"+"*****");
        for(CollegeEmployee1 e:allCollegeEmployee1){
            System.out.println(e.getId());
        }
    }
}
//直接朋友類 Employee1、CollegeManager1
//CollegeEmployee1不是直接朋友，違背了狄米特原則，不能以局部變量出現在類的內部
class SchoolManager1{
    public List<Employee1> getAllEmployee1(){
        List<Employee1> Employee1List=new ArrayList<Employee1>();
        for (int i=0;i<5;i++){
            Employee1 Employee1 = new Employee1();
            Employee1.setId("學校總部員工="+i);
            Employee1List.add(Employee1);
        }
        return Employee1List;
    }
//    void printAllEmployee1(){
    void printAllEmployee1(CollegeManager1 collegeManager1){
        //§1 CollegeEmployee1不是SchoolManager1的直接朋友，
        //§2 是以局部變量的方式出現在這個類中，
        //§3 違反了狄米特法則
        //§4 將輸出CollegeEmployee的方法移動到CollegeManager類中
//        List<CollegeEmployee1> allCollegeEmployee1 = collegeManager1.getAllCollegeEmployee1();
//        System.out.println("*****"+"學院員工"+"*****");
//        for(CollegeEmployee1 e:allCollegeEmployee1){
//            System.out.println(e.getId());
//        }
        collegeManager1.printCollegeEmployee1();
        List<Employee1> allEmployee1 = this.getAllEmployee1();
        System.out.println("*****"+"學校總部員工"+"*****");
        for (Employee1 e:allEmployee1){
            System.out.println(e.getId());
        }
    }
}