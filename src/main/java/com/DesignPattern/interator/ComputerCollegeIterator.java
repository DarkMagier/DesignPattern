package com.DesignPattern.interator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
    //這裏我們需要知道Department是用怎樣的方式存放
    Department[] departments;
    int position=0;//遍歷的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return position < departments.length && departments[position] != null;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }
    public void remove(){
        //默認空實現
    }
}
