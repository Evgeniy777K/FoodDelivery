package com.foodDelivery.project.menu;

import com.foodDelivery.project.client.ClientMenu;
import com.foodDelivery.project.exception.MyException;
import com.foodDelivery.project.utils.InputValue;
import com.foodDelivery.project.utils.StorageDelivery;
import com.foodDelivery.project.utils.StorageMyFood;
import com.foodDelivery.project.utils.WriteToListOfOrders;
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
                System.out.println(StorageMyFood.getStorageFood(storageFood));

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

        ClientMenu.printClientMenu();
    }
}
