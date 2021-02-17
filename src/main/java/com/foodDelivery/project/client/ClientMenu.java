package com.foodDelivery.project.client;

import com.foodDelivery.project.utils.ConfigProperties;

import java.util.ArrayList;
import java.util.List;

public class ClientMenu {
    static List<String> menu = new ArrayList<>();
    static List<String> clients = new ArrayList<>();


    public static void addFoodClientMenu() {
        menu.add(ConfigProperties.getProperty("fastFood1"));
        menu.add(ConfigProperties.getProperty("fastFood2"));
        menu.add(ConfigProperties.getProperty("fastFood3"));
        menu.add(ConfigProperties.getProperty("northIndianFood1"));
        menu.add(ConfigProperties.getProperty("northIndianFood2"));
        menu.add(ConfigProperties.getProperty("northIndianFood3"));
        menu.add(ConfigProperties.getProperty("southIndianFood1"));
        menu.add(ConfigProperties.getProperty("southIndianFood2"));
        menu.add(ConfigProperties.getProperty("southIndianFood3"));
    }

    public static void addClients() {
        clients.add(ConfigProperties.getProperty("client1"));
        clients.add(ConfigProperties.getProperty("client2"));
        clients.add(ConfigProperties.getProperty("client3"));

    }

    public static void clientOrder() {
        String str = "Client name: " + clients.get(0) + " " + "Order" + " " + menu.get(1) + "\r\n" +
                ("Client name: " + clients.get(1) + " " + "Order" + " " + menu.get(3) + "\r\n" +
                        ("Client name: " + clients.get(2) + " " + "Order" + " " + menu.get(4)));
        System.out.println(str);
    }
}
