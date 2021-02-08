package com.foodDelivery.project.food;

import java.util.List;

public class FoodDaoImplement implements FoodDAO {
    //    acts like an in-memory database
    private List<Food> foodList;

    public FoodDaoImplement() {
        this.foodList = FoodDataBase.fromFoodDataBase();
    }

    public List<Food> findAll() {
        return this.foodList;
    }


}
