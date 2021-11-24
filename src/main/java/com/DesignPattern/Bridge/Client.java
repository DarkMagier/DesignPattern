package com.DesignPattern.Bridge;

public class Client {
    public static void main(String[] args) {
        //get folded phone&brand
        FoldedPhone foldedPhone1 = new FoldedPhone(new XiaoMi());
        foldedPhone1.open();
        foldedPhone1.call();
        foldedPhone1.close();

        FoldedPhone foldedPhone2 = new FoldedPhone(new Vivo());
        foldedPhone2.open();
        foldedPhone2.call();
        foldedPhone2.close();

        UpRightPhone upRightPhone3 = new UpRightPhone(new XiaoMi());
        UpRightPhone upRightPhone4 = new UpRightPhone(new Vivo());
        upRightPhone3.open();
        upRightPhone4.open();
    }
}
