package com.DesignPattern.mediator;

import java.util.HashMap;

public class ConcreteMediator extends Mediator{
    private HashMap<String,String>colleagueMap;
    private HashMap<String,Colleague>interMap;

    public ConcreteMediator() {
        this.interMap = new HashMap<String,Colleague>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        if(colleague instanceof Alarm){
            colleagueMap.put(colleagueName,"Alarm");
            interMap.put("Alarm",colleague);
        }
    }

    @Override
    public void GetMessage(int stateChange, String colleagueName) {
        String instanceName=colleagueMap.get(colleagueName);
        if(instanceName.equals("Alarm")){
            Alarm inst=(Alarm)interMap.get(colleagueName);
            System.out.println("this is Alarm!");
        }
    }

    @Override
    public void SendMessage() {

    }
}
