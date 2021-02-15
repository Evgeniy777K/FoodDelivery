package com.foodDelivery.project.utils;

import com.foodDelivery.project.client.Client;
import com.foodDelivery.project.exception.MyException;
import com.foodDelivery.project.food.FastFood;
import com.foodDelivery.project.food.Food;
import com.foodDelivery.project.food.NorthIndianFood;
import com.foodDelivery.project.food.SouthIndianFood;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static final Logger LOGGER = Logger.getLogger(Menu.class);

    public static void printMyMenu() throws MyException, IOException {
        List<String> storageDelivery = new ArrayList<>();
        List<String> storageFood = new ArrayList<>();
        WriteToListOfOrders wr = new WriteToListOfOrders();


        boolean userHungry = true;
        System.out.println("======Welcome to the Glovo ======\n\t\"Possible delivery on the streets");
        System.out.println(StorageDelivery.getStorageDelivery(storageDelivery));
        System.out.println("What is you address?");

        String address = InputValue.inputValue();

        switch (address) {
            case "Pivnichna":
                LOGGER.info("Please write the street where you want to receive delivery.");
                for (String street : storageDelivery) {
                    if (street.equals("Pivnichna")) {
                        System.out.println("Cost delivery " + storageDelivery.get(1) + " $ " + "Time delivery " + storageDelivery.get(2) + " min " +
                                "Distance delivery " + storageDelivery.get(3) + " km " + "\r\n");
                        wr.bufferedWriter.write(storageDelivery.get(0) + " Street " +
                                "Cost delivery " + storageDelivery.get(1) + " $ " + "Time delivery " + storageDelivery.get(2) + " min " +
                                "Distance delivery " + storageDelivery.get(3) + " km " + "\r\n");
                        wr.bufferedWriter.close();
                    }
                }
                break;
            case "Stroiteley":
                for (String street : storageDelivery) {
                    if (street.equals("Stroiteley")) {
                        System.out.println("Cost delivery " + storageDelivery.get(1) + " $ " + "Time delivery " + storageDelivery.get(2) + " min " +
                                "Distance delivery " + storageDelivery.get(3) + " km " + "\r\n");
                        wr.bufferedWriter.write(storageDelivery.get(0) + " Street " +
                                "Cost delivery " + storageDelivery.get(1) + " $ " + "Time delivery " + storageDelivery.get(2) + " min " +
                                "Distance delivery " + storageDelivery.get(3) + " km " + "\r\n");
                        wr.bufferedWriter.close();
                    }
                }
                break;
            case "Lisovogo":
                for (String street : storageDelivery) {
                    if (street.equals("Lisovogo")) {
                        System.out.println("Cost delivery " + storageDelivery.get(1) + " $ " + "Time delivery " + storageDelivery.get(2) + " min " +
                                "Distance delivery " + storageDelivery.get(3) + " km " + "\r\n");
                        wr.bufferedWriter.write(storageDelivery.get(0) + " Street " +
                                "Cost delivery " + storageDelivery.get(1) + " $ " + "Time delivery " + storageDelivery.get(2) + " min " +
                                "Distance delivery " + storageDelivery.get(3) + " km " + "\r\n");
                        wr.bufferedWriter.close();
                    }
                }
                break;
            default:
                throw new IllegalArgumentException("Wrong street: " + address);
        }


        System.out.println("======Welcome to the Restaurant ======\n\t\"What is your name?");
        String userName = InputValue.inputValue();
        while (userHungry == true) {
            System.out.println("Are you hungry " + userName + "?");
            String userYesNo = InputValue.inputValue();
            if (userYesNo.equalsIgnoreCase("yes")) {
                System.out.println("Food Menu");
                System.out.println(StorageFood.getStorageFood(storageFood));

                System.out.println("Press 1 - select FriedChicken.\nPress 2 - select RibeyeSteak." +
                        "\nPress 3 - select Beefsteak." + "\nPress 4 - select Mimosa.\n" + "Press 5 - select GreekSalad.\n" +
                        "Press 6 - select Cheesecake.\n" + "Press 7 - select Mango.");
                System.out.print("Please make you choice: ");


                int selection = Integer.parseInt(InputValue.inputValue());

                switch (selection) {
                    case 1:
                        for (String food : storageFood) {
                            if (food.equals("FriedChicken")) {
                                System.out.println("Cost food " + storageFood.get(1) + " $ "
                                        + "Quantity food " + storageFood.get(2) + " pieces " + "\r\n");
                                wr.bw.write(storageFood.get(0) + " Food " +
                                        "Cost food " + storageFood.get(1) + " $ " + "Quantity food " +
                                        storageFood.get(2) + " pieces " + "\r\n");
                                wr.bw.close();
                            }
                        }
                        break;
                    case 2:
                        for (String food : storageFood) {
                            if (food.equals("RibeyeSteak")) {
                                System.out.println("Cost food " + storageFood.get(1) + " $ "
                                        + "Quantity food " + storageFood.get(2) + " pieces " + "\r\n");
                                wr.bw.write(storageFood.get(0) + " Food " +
                                        "Cost food " + storageFood.get(1) + " $ " + "Quantity food " +
                                        storageFood.get(2) + " pieces " + "\r\n");
                                wr.bw.close();
                            }
                        }
                        break;
                    case 3:
                        for (String food : storageFood) {
                            if (food.equals("Beefsteak")) {
                                System.out.println("Cost food " + storageFood.get(1) + " $ "
                                        + "Quantity food " + storageFood.get(2) + " pieces " + "\r\n");
                                wr.bw.write(storageFood.get(0) + " Food " +
                                        "Cost food " + storageFood.get(1) + " $ " + "Quantity food " +
                                        storageFood.get(2) + " pieces " + "\r\n");
                                wr.bw.close();
                            }
                        }
                        break;
                    case 4:
                        for (String food : storageFood) {
                            if (food.equals("Mimosa")) {
                                System.out.println("Cost food " + storageFood.get(1) + " $ "
                                        + "Quantity food " + storageFood.get(2) + " pieces " + "\r\n");
                                wr.bw.write(storageFood.get(0) + " Food " +
                                        "Cost food " + storageFood.get(1) + " $ " + "Quantity food " +
                                        storageFood.get(2) + " pieces " + "\r\n");
                                wr.bw.close();
                            }
                        }
                        break;
                    case 5:
                        for (String food : storageFood) {
                            if (food.equals("GreekSalad")) {
                                System.out.println("Cost food " + storageFood.get(1) + " $ "
                                        + "Quantity food " + storageFood.get(2) + " pieces " + "\r\n");
                                wr.bw.write(storageFood.get(0) + " Food " +
                                        "Cost food " + storageFood.get(1) + " $ " + "Quantity food " +
                                        storageFood.get(2) + " pieces " + "\r\n");
                                wr.bw.close();
                            }
                        }
                        break;
                    case 6:
                        for (String food : storageFood) {
                            if (food.equals("Cheesecake")) {
                                System.out.println("Cost food " + storageFood.get(1) + " $ "
                                        + "Quantity food " + storageFood.get(2) + " pieces " + "\r\n");
                                wr.bw.write(storageFood.get(0) + " Food " +
                                        "Cost food " + storageFood.get(1) + " $ " + "Quantity food " +
                                        storageDelivery.get(2) + " pieces " + "\r\n");
                                wr.bw.close();
                            }
                        }
                        break;
                    case 7:
                        for (String food : storageFood) {
                            if (food.equals("Mango")) {
                                System.out.println("Cost food " + storageFood.get(1) + " $ "
                                        + "Quantity food " + storageFood.get(2) + " pieces " + "\r\n");
                                wr.bw.write(storageFood.get(0) + " Food " +
                                        "Cost food " + storageFood.get(1) + " $ " + "Quantity food " +
                                        storageFood.get(2) + " pieces " + "\r\n");
                                wr.bw.close();
                            }
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Wrong number: " + selection);
                }
            } else {
                userHungry = false;
                System.out.println("Goodbye " + userName + " have a nice day.");
            }
        }


    }

    public static void printClientMenu() {
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
            }
            System.out.println("Total: " + totalPrice + "$");
            totalPrice = 0;
            System.out.println();

        }
    }
}

