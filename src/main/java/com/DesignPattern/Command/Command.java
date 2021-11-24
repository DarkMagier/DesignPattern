package com.DesignPattern.Command;

public interface Command {
    //執行某個命令
    public void execute();

    //撤銷
    public void undo();
}
