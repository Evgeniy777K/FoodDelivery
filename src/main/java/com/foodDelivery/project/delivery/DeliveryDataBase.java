package com.foodDelivery.project.delivery;

import java.util.ArrayList;
import java.util.List;

public enum DeliveryDataBase {

    PIVNICHNA("Pivnichna", 50, 30, 10),
    POLOVA("Polova", 70, 50, 15),
    CENTRAL("Central", 100, 60, 20);

    private String address;
    private int costDelivery;
    private int timeDelivery;
    private int distanceDelivery;


    DeliveryDataBase(String address, int costDelivery, int timeDelivery, int distanceDelivery) {
        this.address = address;
        this.costDelivery = costDelivery;
        this.timeDelivery = timeDelivery;
        this.distanceDelivery = distanceDelivery;
    }

    public String getAddress() {
        return address;
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


    public static List<Delivery> fromOrdersDataBase() {
        List<Delivery> deliveries = new ArrayList<>();
        for (DeliveryDataBase orderDB : values()) {
            deliveries.add(new Delivery(orderDB.costDelivery, orderDB.distanceDelivery, orderDB.timeDelivery, orderDB.address));
        }
        return deliveries;
    }

    @Override
    public String toString() {
        return "DeliveryDataBase{" +
                "costDelivery=" + costDelivery +
                ", timeDelivery=" + timeDelivery +
                ", distanceDelivery=" + distanceDelivery +
                '}';
    }
}
