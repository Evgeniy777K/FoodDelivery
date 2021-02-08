package com.foodDelivery.project.food;

import java.util.List;

public interface FoodDAO {
    // Interface for saving / retrieving an entity from the database
    List<Food> findAll();

   }
