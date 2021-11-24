package com.DesignPattern.Composite;

public class Client {
    public static void main(String[] args) {
        University university = new University("清華大學", "china");
        College college1 = new College("computer", "computer");
        College college2 = new College("info", "business");

        college1.add(new Department("軟件工程","軟件工程"));
        college1.add(new Department("網絡工程","網絡工程"));
        college1.add(new Department("計算機科學與技術","計算機科學與技術"));

        college2.add(new Department("信息工程","信息工程"));
        college2.add(new Department("通信工程","通信工程"));

        university.add(college1);
        university.add(college2);

        university.print();
    }
}
