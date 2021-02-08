package com.foodDelivery.project.delivery;

import java.util.List;

public interface DeliveryDAO {
    // Interface for saving / retrieving an entity from the database
    List<Delivery> findAll();


}
