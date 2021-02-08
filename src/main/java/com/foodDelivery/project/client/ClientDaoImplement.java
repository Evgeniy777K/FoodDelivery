package com.foodDelivery.project.client;

import com.foodDelivery.project.food.Food;

import java.util.ArrayList;
import java.util.List;

public class ClientDaoImplement implements ClientDAO {
    public List<Client> clientList;


    public ClientDaoImplement() {
        this.clientList = ClientDataBase.fromClientDataBase();
    }

    public List<Client> findAll() {
        return this.clientList;
    }


    @Override
    public List<Client> findByFood(Food food) {
        List<Client> clients = new ArrayList<Client>();
        for (Client client : this.clientList) {
            if (client.getFood().equals(food)) {
                clients.add(client);
            }
        }
        return clients;
    }


}
