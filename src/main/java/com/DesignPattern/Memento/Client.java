package com.DesignPattern.Memento;

public class Client {
    public static void main(String[] args) {
        Originator originator=new Originator();
        Caretacker caretacker= new Caretacker();

        originator.setState("State #1 攻擊力：100");

        //保存了當前的狀態
        caretacker.add(originator.saveStateMemento());

        originator.setState("State #2 攻擊力：80");
        caretacker.add(originator.saveStateMemento());

        originator.setState("State #3 攻擊力：60");
        caretacker.add(originator.saveStateMemento());

        //return to State 1
        System.out.println("Current State="+originator.getState());
        originator.getStateFromMemento(caretacker.get(0));
        System.out.println("Return to State="+originator.getState());

    }

}
