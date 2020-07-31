package com.example.weather.controller;

import com.example.weather.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurrentWeatherController {

    private final WeatherService weatherService;

    @GetMapping("/current-weather")
    public String getCurrentWeather(Model model) {
        model.addAttribute("currentWeather", weatherService.getCurrentWeather("Detroit ","US"));
        return "current-weather";
    }

    public CurrentWeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
}
