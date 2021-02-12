package com.foodDelivery.project;

import com.foodDelivery.project.exception.MyException;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Menu {
    private static final Logger LOGGER = Logger.getLogger(Menu.class);

    public static void printMenu() throws MyException, IOException {
        Map<String, Integer> storageDelivery = new LinkedHashMap<>();
        Map<String, Integer> storageFood = new LinkedHashMap<>();

        WriteToListOfOrders wr = new WriteToListOfOrders();

        String listOfOrders;
        String listOfDelivery;

        boolean userHungry = true;
        System.out.println("======Welcome to the Glovo ======\n\t\"Possible delivery on the streets");
        System.out.println(StorageDelivery.getStorageDelivery(storageDelivery) + "$");
        System.out.println("What is you address?");

        String address = InputValue.inputValue();

        switch (address) {
            case "Pivnichna":
                LOGGER.info("Please write the street where you want to receive delivery.");
                listOfDelivery = "Pivnichna " + "Cost delivery " + storageDelivery.get("Pivnichna") + "$";
                System.out.println("Cost delivery " + storageDelivery.get("Pivnichna") + "$");
                wr.bufferedWriter.write(listOfDelivery + "\r\n");
                wr.bufferedWriter.close();
                break;
            case "Stroiteley":
                listOfDelivery = "Stroiteley " + "Cost delivery " + storageDelivery.get("Stroiteley") + "$";
                System.out.println("Cost delivery " + storageDelivery.get("Stroiteley") + "$");
                wr.bufferedWriter.write(listOfDelivery + "\r\n");
                wr.bufferedWriter.close();
                break;
            case "Lisovogo":
                listOfDelivery = "Lisovogo " + "Cost delivery " + storageDelivery.get("Lisovogo") + "$";
                System.out.println("Cost delivery " + storageDelivery.get("Lisovogo") + "$");
                wr.bufferedWriter.write(listOfDelivery + "\r\n");
                wr.bufferedWriter.close();
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
                System.out.println(StorageFood.getStorageFood(storageFood) + "$");

                System.out.println("Press 1 - select FriedChicken.\nPress 2 - select RibeyeSteak." +
                        "\nPress 3 - select Beefsteak." + "\nPress 4 - select Mimosa.\n" + "Press 5 - select GreekSalad.\n" +
                        "Press 6 - select Cheesecake.\n" + "Press 7 - select Mango.");
                System.out.print("Please make you choice: ");


                int selection = Integer.parseInt(InputValue.inputValue());

                switch (selection) {
                    case 1:
                        listOfOrders = "FriedChicken " + "Cost food " + storageFood.get("FriedChicken") + "$";
                        System.out.println("Cost food- " + storageFood.get("FriedChicken") + "$");
                        wr.bw.write(listOfOrders + "\r\n");
                        wr.bw.close();
                        break;
                    case 2:
                        listOfOrders = "RibeyeSteak " + "Cost food " + storageFood.get("FriedChicken") + "$";
                        System.out.println("Cost food- " + storageFood.get("RibeyeSteak") + "$");
                        wr.bw.write(listOfOrders + "\r\n");
                        wr.bw.close();
                        break;
                    case 3:
                        listOfOrders = "Beefsteak " + "Cost food " + storageFood.get("Beefsteak") + "$";
                        System.out.println("Cost food- " + storageFood.get("Beefsteak") + "$");
                        wr.bw.write(listOfOrders + "\r\n");
                        wr.bw.close();
                        break;
                    case 4:
                        listOfOrders = "Mimosa " + "Cost food " + storageFood.get("Mimosa") + "$";
                        System.out.println("Cost food- " + storageFood.get("Mimosa") + "$");
                        wr.bw.write(listOfOrders + "\r\n");
                        wr.bw.close();
                        break;
                    case 5:
                        listOfOrders = "GreekSalad " + "Cost food " + storageFood.get("GreekSalad") + "$";
                        System.out.println("Cost food- " + storageFood.get("GreekSalad") + "$");
                        wr.bw.write(listOfOrders + "\r\n");
                        wr.bw.close();
                        break;
                    case 6:
                        listOfOrders = "Cheesecake " + "Cost food " + storageFood.get("Cheesecake") + "$";
                        System.out.println("Cost food- " + storageFood.get("Cheesecake") + "$");
                        wr.bw.write(listOfOrders + "\r\n");
                        wr.bw.close();
                        break;
                    case 7:
                        listOfOrders = "Mango " + "Cost food " + storageFood.get("Mango") + "$";
                        System.out.println("Cost food- " + storageFood.get("Mango") + "$");
                        wr.bw.write(listOfOrders + "\r\n");
                        wr.bw.close();
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

}

