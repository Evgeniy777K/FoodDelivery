package com.foodDelivery.project.client;

import com.foodDelivery.project.food.Food;

public class Client {
    private String name;
    private String phoneNumber;
    private Food food;

    public Client(String name, String phoneNumber, Food food) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.food = food;
    }

    public Client(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "com.foodDelivery.project.client.Client{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", food=" + food.getNameOfDish1() +
                ", food=" + food.getNameOfDish2() +
                ", food=" + food.getNameOfDish3() +
                '}';
    }
}
