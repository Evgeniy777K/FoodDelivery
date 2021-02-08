package com.foodDelivery.project.client;

import com.foodDelivery.project.food.Food;

import java.util.List;

public interface ClientDAO {
    List<Client> findAll();
    List<Client> findByFood(Food food);
}
