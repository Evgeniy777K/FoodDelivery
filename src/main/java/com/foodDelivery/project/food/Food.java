package com.foodDelivery.project.food;

import com.foodDelivery.project.order.Order;

public class Food extends Order {
    private String name;
    private int price;




    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Food{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
