package com.DesignPattern.Visitor;
//1.這裏是雙分派，首先在客戶端程序中，將具體狀態作為參數傳遞Woman中
//2.然後Woman類調用作為參數的具體方法，同時將自己作為參數傳入，完成第二次分派
public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
