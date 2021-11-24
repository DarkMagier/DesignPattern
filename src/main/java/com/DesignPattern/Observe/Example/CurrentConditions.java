package com.DesignPattern.Observe.Example;
//顯示當前天氣情況，可以理解為氣象站自己的網站
public class CurrentConditions {
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
        System.out.println("temperature:"+temperature);
        System.out.println("pressure:"+pressure);
        System.out.println("humidity:"+humidity);
    }
}
