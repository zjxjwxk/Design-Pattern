package com.zjut.designpattern.observerpattern;

import com.zjut.designpattern.observerpattern.observer.CurrentConditionDisplay;
import com.zjut.designpattern.observerpattern.observer.ForecastDisplay;
import com.zjut.designpattern.observerpattern.observer.HeatIndexDisplay;
import com.zjut.designpattern.observerpattern.observer.StatisticsDisplay;
import com.zjut.designpattern.observerpattern.subject.WeatherData;

/**
 * @author zjxjwxk
 * @date 2020-06-26 20:50
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
