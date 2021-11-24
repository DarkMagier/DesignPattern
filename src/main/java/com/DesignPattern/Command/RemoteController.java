package com.DesignPattern.Command;

public class RemoteController {
    //開按鈕
    Command[] onCommands;
    Command[] offCommands;

    //執行撤銷命令
    Command undoCommand;

    public RemoteController() {
        onCommands=new Command[5];
        offCommands=new Command[5];
        for(int i=0;i<5;i++){
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }
    public void  setCommand(int no,Command on,Command off){
        onCommands[no]=on;
        offCommands[no]=off;
    }
    public void onButtonWasPushed(int no){
        onCommands[no].execute();
        undoCommand=onCommands[no];
    }
    public void offButtonWasPushed(int no){
        offCommands[no].execute();
        undoCommand=offCommands[no];
    }
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
