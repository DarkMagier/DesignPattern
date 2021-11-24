package com.principle.Demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter01 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}
//總部員工
class Employee{
    private String id;

    public void setId(String id) {
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
}

//學院的員工
class CollegeEmployee{
    private String id;

    public void setId(String id) {
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
}
class CollegeManager{
    public List<CollegeEmployee> getAllCollegeEmployee(){
        List<CollegeEmployee> collegeEmployeeList=new ArrayList<CollegeEmployee>();
        for (int i=0;i<10;i++){
            CollegeEmployee collegeEmployee=new CollegeEmployee();
            collegeEmployee.setId("學院員工id="+i);
            collegeEmployeeList.add(collegeEmployee);
        }
        return collegeEmployeeList;
    }
}
//直接朋友類 Employee、CollegeManager
//CollegeEmployee不是直接朋友，違背了狄米特原則，不能以局部變量出現在類的內部
class SchoolManager{
    public List<Employee> getAllEmployee(){
        List<Employee> employeeList=new ArrayList<Employee>();
        for (int i=0;i<5;i++){
            Employee employee = new Employee();
            employee.setId("學校總部員工="+i);
            employeeList.add(employee);
        }
        return employeeList;
    }
    void printAllEmployee(CollegeManager collegeManager){
        //§1 CollegeEmployee不是SchoolManager的直接朋友，
        //§2 是以局部變量的方式出現在這個類中，
        //§3 違反了狄米特法則

        List<CollegeEmployee> allCollegeEmployee = collegeManager.getAllCollegeEmployee();
        System.out.println("*****"+"學院員工"+"*****");
        for(CollegeEmployee e:allCollegeEmployee){
            System.out.println(e.getId());
        }
        List<Employee> allEmployee = this.getAllEmployee();
        System.out.println("*****"+"學校總部員工"+"*****");
        for (Employee e:allEmployee){
            System.out.println(e.getId());
        }
    }
}