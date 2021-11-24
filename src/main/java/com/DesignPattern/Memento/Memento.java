package com.DesignPattern.Memento;

public class Memento {
    private String state;
    //構造器
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
    public Memento saveStateMemento(){
        return new Memento(state);
    }

}

