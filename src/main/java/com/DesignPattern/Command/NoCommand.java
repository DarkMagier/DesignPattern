package com.DesignPattern.Command;
//沒有任何命令，空執行，初始化每個按鈕
//調用空命令時，對象什麼都不做
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
