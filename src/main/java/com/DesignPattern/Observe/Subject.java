package com.DesignPattern.Observe;
// interface for weather data
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
