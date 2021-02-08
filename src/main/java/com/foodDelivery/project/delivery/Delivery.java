package com.foodDelivery.project.delivery;

import com.foodDelivery.project.food.Food;

import java.util.List;

public class Delivery {
    private int costDelivery;
    private int timeDelivery;
    private int distanceDelivery;
    private String address;
    List<Food> dishes;

    public Delivery(int costDelivery, int timeDelivery, int distanceDelivery, String address, List<Food> dishes) {
        this.costDelivery = costDelivery;
        this.timeDelivery = timeDelivery;
        this.distanceDelivery = distanceDelivery;
        this.address = address;
        this.dishes = dishes;

    }

    public Delivery(int costDelivery, int distanceDelivery, int timeDelivery, String address) {
        this.costDelivery = costDelivery;
        this.distanceDelivery = distanceDelivery;
        this.timeDelivery = timeDelivery;
        this.address = address;
    }

    public Delivery() {

    }

    public int getCostDelivery() {
        return costDelivery;
    }

    public int getTimeDelivery() {
        return timeDelivery;
    }

    public int getDistanceDelivery() {
        return distanceDelivery;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "costDelivery=" + costDelivery +
                ", timeDelivery=" + timeDelivery +
                ", distanceDelivery=" + distanceDelivery +
                ", address='" + address + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
