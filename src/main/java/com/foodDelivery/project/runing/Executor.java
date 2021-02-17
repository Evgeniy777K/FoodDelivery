package com.foodDelivery.project.runing;


import com.foodDelivery.project.client.ClientMenu;
import com.foodDelivery.project.exception.MyException;
import com.foodDelivery.project.menu.Menu;

import java.io.IOException;

public class Executor {

    public static void main(String[] args) throws MyException, IOException {
        Menu.printMyMenu();
        ClientMenu.addFoodClientMenu();
        ClientMenu.addClients();
        ClientMenu.clientOrder();


    }
}
