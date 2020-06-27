package com.zjut.designpattern.observerpattern.jdk.observer;

import com.zjut.designpattern.observerpattern.jdk.DisplayElement;
import com.zjut.designpattern.observerpattern.jdk.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * 目前状况布告板（观察者）
 * @author zjxjwxk
 * @date 2020-06-26 20:39
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * 判断是否为WeatherData所提醒，并从可观察者拉取更新后的数据，最后显示
     * @param o 可观察者
     * @param arg 可观察者推送的数据，此处为null
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and "
                + humidity + "% humidity");
    }
}
