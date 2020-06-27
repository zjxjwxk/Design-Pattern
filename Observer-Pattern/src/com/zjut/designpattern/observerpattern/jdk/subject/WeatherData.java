package com.zjut.designpattern.observerpattern.jdk.subject;

import java.util.Observable;

/**
 * 天气数据类（可观察者）
 * @author zjxjwxk
 * @date 2020-06-26 20:04
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public void measurementsChanged() {
        setChanged();
        // 没有参数，则表示观察者自己拉取（推送的数据为null），否则为可观察者推送给观察者
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /*
    观察者自己拉取，可观察者需要提供getter函数
     */

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
