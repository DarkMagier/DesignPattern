package com.DesignPattern.Observe;

import com.DesignPattern.Observe.Example.CurrentConditions;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        observers=new ArrayList<Observer>();

    }

    private ArrayList<Observer> observers;

    public void setData(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        display();
    }
    public void display(){
        System.out.println("**************************");
        System.out.println("Attention! Subject change:");
        System.out.println("temperature="+temperature);
        System.out.println("pressure="+pressure);
        System.out.println("humidity="+humidity);
        System.out.println("**************************");
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
            observers.get(i).update(temperature,pressure,humidity);
        }
    }
}
