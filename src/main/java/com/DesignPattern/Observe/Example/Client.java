package com.DesignPattern.Observe.Example;

public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);

        weatherData.setData(30,150,40);
        weatherData.dataChang();

        weatherData.setData(25,120,40);
    }
}
