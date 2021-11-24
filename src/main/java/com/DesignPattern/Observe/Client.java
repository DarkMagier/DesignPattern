package com.DesignPattern.Observe;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();

        weatherData.registerObserver(currentConditions);

        System.out.println("---------------------");
        weatherData.setData(10f,30,120f);

        BaiduSite baiduSite = new BaiduSite();
        weatherData.registerObserver(baiduSite);

        weatherData.notifyObserver();
    }
}
