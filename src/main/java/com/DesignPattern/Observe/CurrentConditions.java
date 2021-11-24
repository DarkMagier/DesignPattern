package com.DesignPattern.Observe;

public class CurrentConditions implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    //更新天氣情況 for WeatherData
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    public void display(){
        System.out.println("**************************");
        System.out.println("Current Conditions:");
        System.out.println("temperature:"+temperature);
        System.out.println("pressure:"+pressure);
        System.out.println("humidity:"+humidity);
        System.out.println("**************************");
    }
}
