package com.foodDelivery.project.order;

import com.foodDelivery.project.food.Food;

import java.util.HashMap;
import java.util.Map;

public class Order {
    public Map<Food, Integer> orderFood;

    public Order() {
        orderFood = new HashMap<>();
    }


    public void addFood(Food food) {
        int count = 1;
        for (Food food1 : orderFood.keySet()) {
            if (food1.getName().contentEquals(food.getName())) {
                int oldQuantity = orderFood.get(food1);
                orderFood.put(food1, ++oldQuantity);
                return;
            }
        }
        orderFood.put(food, count);
    }
}