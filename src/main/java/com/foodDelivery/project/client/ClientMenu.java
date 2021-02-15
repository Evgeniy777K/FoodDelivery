package com.foodDelivery.project.client;

import com.foodDelivery.project.food.FastFood;
import com.foodDelivery.project.food.Food;
import com.foodDelivery.project.food.NorthIndianFood;
import com.foodDelivery.project.food.SouthIndianFood;

import java.util.ArrayList;
import java.util.List;

public class ClientMenu {
    static String orderFood;

    public static String printClientMenu() {
        List<Food> menu = new ArrayList<>();
        menu.add(new FastFood("Hakka Noodles", 160));
        menu.add(new FastFood("Golden Stir Fried Babycorn", 180));
        menu.add(new FastFood("Chicken Masala", 250));
        menu.add(new FastFood("Regular Pizza", 250));
        menu.add(new FastFood("Continental Sizzler", 350));
        menu.add(new NorthIndianFood("Chicken Butter Masala", 320));
        menu.add(new NorthIndianFood("Kadhai Paneer", 250));
        menu.add(new NorthIndianFood("Vegetable Jalfrezi", 220));
        menu.add(new NorthIndianFood("Dal Makhani", 220));
        menu.add(new NorthIndianFood("Butter Naan", 60));
        menu.add(new SouthIndianFood("Masala Dosa", 145));
        menu.add(new SouthIndianFood("Rava Masala Dosa", 165));
        menu.add(new SouthIndianFood("Vegetable Uttapam", 160));
        menu.add(new SouthIndianFood("Rava Idli", 125));
        menu.add(new SouthIndianFood("Masala Vada", 130));


        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Vasiliy", "097-9588781"));
        clients.add(new Client("Petr", "097-9858778"));
        clients.add(new Client("Igor", "097-9588845"));
        // Take menu
        clients.get(0).getMenu(menu);
        clients.get(1).getMenu(menu);
        clients.get(2).getMenu(menu);

        clients.get(0).addOrder(new FastFood("Hakka Noodles", 160));
        clients.get(1).addOrder(new NorthIndianFood("Chicken Butter Masala", 320));
        clients.get(2).addOrder(new SouthIndianFood("Vegetable Jalfrezi", 220));

        int totalPrice = 0;
        for (Client client : clients) {
            System.out.println(client.getNameClient());

            for (Food food : client.orders.orderFood.keySet()) {
                int quantity = client.orders.orderFood.get(food);
                totalPrice += quantity * food.getPrice();
                System.out.println(food.getName() + "\t" + quantity * food.getPrice() + "$");
                orderFood = client.getNameClient() + " " + food.getName() + " " + quantity * food.getPrice() + "$";
            }
            System.out.println("Total: " + totalPrice + "$");
            totalPrice = 0;
            System.out.println();

        }
        return orderFood;
    }

}
