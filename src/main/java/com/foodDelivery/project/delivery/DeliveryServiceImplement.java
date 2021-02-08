package com.foodDelivery.project.delivery;

import java.util.List;

public class DeliveryServiceImplement implements DeliveryDAO {
    public List<Delivery> listOfOrders;


    public DeliveryServiceImplement() {
        this.listOfOrders = DeliveryDataBase.fromOrdersDataBase();
    }

    @Override
    public List<Delivery> findAll() {
        return this.listOfOrders;
    }



}
