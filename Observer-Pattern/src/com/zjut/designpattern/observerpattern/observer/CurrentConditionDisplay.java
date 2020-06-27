package com.zjut.designpattern.observerpattern.observer;

import com.zjut.designpattern.observerpattern.DisplayElement;
import com.zjut.designpattern.observerpattern.Observer;
import com.zjut.designpattern.observerpattern.Subject;

/**
 * 目前状况布告板
 * @author zjxjwxk
 * @date 2020-06-26 20:39
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
