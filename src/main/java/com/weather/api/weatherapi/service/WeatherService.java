package com.weather.api.weatherapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weather.api.weatherapi.config.WeatherProperties;
import com.weather.api.weatherapi.dto.WeatherData;

@Service
public class WeatherService {
	@Autowired
	private  RestTemplate restTemplate;
	@Autowired
    private  WeatherProperties weatherProperties;

    

    public WeatherData getCurrentWeather(String city) {
        String apiKey = weatherProperties.getApiKey();
        String apiUrl = "http://api.weatherstack.com/current?access_key=" + apiKey+"query"+city;

        WeatherData weatherData = restTemplate.getForObject(apiUrl, WeatherData.class);

        if (weatherData != null) {
            return weatherData;
        } else {
            return null;
        }
    }
	
}
