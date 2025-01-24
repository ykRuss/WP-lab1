package com.humber.Week1ThymeleafProject.repositories;


import com.humber.Week1ThymeleafProject.models.Dish;

import java.util.ArrayList;
import java.util.List;

public class DishRepository {

        private static List<Dish> dishes = new ArrayList<>();
    
        public static List<Dish> getAllDishes() {
            if (dishes.isEmpty()) { 
                dishes.add(
                        Dish.builder()
                                .id(1)
                                .name("Shawarma")
                                .category("Non-Veg")
                                .price(10.0)
                                .build()
                );
    
                dishes.add(
                        Dish.builder()
                                .id(2)
                                .name("Burger")
                                .category("Non-veg")
                                .price(15.5)
                                .build()
                );
    
                dishes.add(
                        Dish.builder()
                                .id(3)
                                .name("Steak")
                                .category("Non-veg")
                                .price(16.5)
                                .build()
                );
            }
            return dishes;
        }
    }
    