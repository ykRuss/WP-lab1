package com.humber.Week1ThymeleafProject.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DishController {

    @Value("${restaurant.name}")
    private String restaurantName;

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }
}
