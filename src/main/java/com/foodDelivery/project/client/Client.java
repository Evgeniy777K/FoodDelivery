package com.foodDelivery.project.client;

import com.foodDelivery.project.food.Food;
import com.foodDelivery.project.order.Order;

import java.util.List;

public class Client {
    private String nameClient;
    private String mobileNumber;
    private List<Food> menu;
    public Order orders;


    public Client(String nameClient, String mobileNumber) {
        this.nameClient = nameClient;
        this.mobileNumber = mobileNumber;
        this.orders = new Order();
    }


    public String getNameClient() {
        return nameClient;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }


    public void getMenu(List<Food> food) {
        this.menu = food;
    }

    public void addOrder(Food food) {
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).getName().contentEquals(food.getName())) {
                orders.addFood(food);
                return;
            }
        }
    }

}
