package com.humber.Week1ThymeleafProject.services;


import com.humber.Week1ThymeleafProject.models.Dish;
import com.humber.Week1ThymeleafProject.repositories.DishRepository;

import java.util.List;

public class DishService {

    public List<Dish> getAllDishes() {
        return DishRepository.getAllDishes();
    }
}
