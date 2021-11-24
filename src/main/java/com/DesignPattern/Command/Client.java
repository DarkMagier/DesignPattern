package com.DesignPattern.Command;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(2,lightOnCommand,lightOffCommand);


        remoteController.onButtonWasPushed(2);
        remoteController.offButtonWasPushed(2);
        remoteController.undoButtonWasPushed();
    }

}
