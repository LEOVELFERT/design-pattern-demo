package creational.observer.impl;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    List<Observer> observers;
    int temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    @Override
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {

        for (Observer observer : observers) {
            observer.update(this.temperature);
        }
    }
}
