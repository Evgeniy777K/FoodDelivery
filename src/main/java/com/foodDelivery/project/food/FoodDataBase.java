package com.foodDelivery.project.food;

import java.util.ArrayList;
import java.util.List;

public enum FoodDataBase {
    MEAT("Beef steak", "Ribeye Steak", "Fried Chicken", 25),
    SALAD("Caesar salad", "Mimosa salad", "Greek salad", 20),
    DESSERT("Chocolate pie", "Classic cheesecake", "Sour cream cake", 7),
    FRUIT("Mangosteen", "Mango", "Jackfruit", 10);

    private String nameOfDish1;
    private String nameOfDish2;
    private String nameOfDish3;
    private int price;

    FoodDataBase(String nameOfDish1, String nameOfDish2, String nameOfDish3, int price) {
        this.nameOfDish1 = nameOfDish1;
        this.nameOfDish2 = nameOfDish2;
        this.nameOfDish3 = nameOfDish3;
        this.price = price;
    }

    public String getNameOfDish1() {
        return nameOfDish1;
    }

    public String getNameOfDish2() {
        return nameOfDish2;
    }

    public String getNameOfDish3() {
        return nameOfDish3;
    }

    public int getPrice() {
        return price;
    }

    public static List<Food> fromFoodDataBase() {
        List<Food> foods = new ArrayList<>();
        for (FoodDataBase foodDB : values()) {
            foods.add(new Food(foodDB.nameOfDish1, foodDB.nameOfDish2, foodDB.nameOfDish3, foodDB.price));
        }

        return foods;
    }

    @Override
    public String toString() {
        return "FoodDataBase{" +
                "nameOfDish1='" + nameOfDish1 + '\'' +
                ", nameOfDish2='" + nameOfDish2 + '\'' +
                ", nameOfDish3='" + nameOfDish3 + '\'' +
                ", price=" + price +
                '}';
    }
}
