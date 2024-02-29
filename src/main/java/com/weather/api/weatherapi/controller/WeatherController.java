package com.weather.api.weatherapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weather.api.weatherapi.dto.WeatherData;
import com.weather.api.weatherapi.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	
		@Autowired
		WeatherService weatherService;

	    @GetMapping("/current")
	    public WeatherData getCurrentWeather(@RequestParam String city) {
	        return weatherService.getCurrentWeather(city);
	    }
	
}
