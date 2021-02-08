package com.foodDelivery.project.controllers;


import com.foodDelivery.project.Menu;
import com.foodDelivery.project.client.Client;
import com.foodDelivery.project.client.ClientDAO;
import com.foodDelivery.project.client.ClientDaoImplement;
import com.foodDelivery.project.exception.MyException;
import com.foodDelivery.project.food.Food;
import com.foodDelivery.project.food.FoodDAO;
import com.foodDelivery.project.food.FoodDaoImplement;

import java.io.IOException;
import java.util.List;

public class FoodController {
    private FoodDAO foodDAO;
    private ClientDAO clientDAO;
    private Menu menu;


    public void start() {
        foodDAO = new FoodDaoImplement();
        clientDAO = new ClientDaoImplement();
        menu = new Menu();

    }

    public void findAll() throws MyException, IOException {
        List<Food> foodList = foodDAO.findAll();
        if (foodList != null) {
            menu.printMenu(foodList);
        }
    }

    public void findByFood(Food food) {
        List<Client> clientList = clientDAO.findByFood(food);
        if (clientList != null) {
        }
    }


}
