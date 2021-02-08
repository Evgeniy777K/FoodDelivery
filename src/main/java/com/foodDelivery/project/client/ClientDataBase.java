package com.foodDelivery.project.client;

import com.foodDelivery.project.food.Food;

import java.util.ArrayList;
import java.util.List;

public enum ClientDataBase {
    OLEG("Oleg", "+380974747445"),
    DASHA("Dasha", "+38088989447"),
    FEDIR("Fedir", "+380653218798"),
    OLENA("Olena", "+380503265487");

    private String name;
    private String phoneNumber;
    private Food food;

    ClientDataBase(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Food getFood() {
        return food;
    }

    public static List<Client> fromClientDataBase() {
        List<Client> clients = new ArrayList<>();
        for (ClientDataBase clientDB:values()){
            clients.add(new Client(clientDB.name,clientDB.phoneNumber));
        }
        return clients;
    }

    @Override
    public String toString() {
        return "com.foodDelivery.project.client.ClientDataBase{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", food=" + food.getNameOfDish1() +
                ", food=" + food.getNameOfDish2() +
                ", food=" + food.getNameOfDish3() +
                '}';
    }
}
