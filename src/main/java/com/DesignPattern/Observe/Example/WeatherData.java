package com.DesignPattern.Observe.Example;

public class WeatherData {//core class
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }
    public void dataChang(){
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
    }
    public void setData(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;

        //調用dataChang，推送
        dataChang();
    }
    public float getHumidity() {
        return humidity;
    }
}
