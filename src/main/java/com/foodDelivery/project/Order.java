package com.foodDelivery.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Order {
    List<String> listOfOrder;
    List<String> listOfDelivery;

    public Order() {
        listOfOrder = new ArrayList<>();
        listOfDelivery = new ArrayList<>();
    }

    public void addOrderFood(String food) {
        listOfOrder.add(food);
    }

    public void addDelivery(String delivery) {
        listOfDelivery.add(delivery);


    }

    public void saveOrders() throws IOException {
        for (String orderFood : listOfOrder) {
            for (String foodDelivery : listOfDelivery) {
                BufferedWriter bw = new BufferedWriter(new FileWriter("data/listOfOrders", true));
                bw.write(orderFood + "\r\n");
                bw.write(foodDelivery + "\r\n");
                System.out.println(orderFood);
                bw.close();
            }
        }
    }


}


