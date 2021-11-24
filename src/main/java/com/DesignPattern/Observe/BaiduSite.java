package com.DesignPattern.Observe;

public class BaiduSite implements Observer{
    private String name="Baidu";
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
        System.out.println(name+" temperature:"+temperature);
        System.out.println(name+" pressure:"+pressure);
        System.out.println(name+" humidity:"+humidity);
    }
}
