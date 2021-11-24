package com.DesignPattern.interator;

import java.util.Iterator;

public interface College {
    public String getname();
    public void addDepartment(String name, String desc);
    public Iterator createIterator();
}
