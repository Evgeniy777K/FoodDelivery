package com.foodDelivery.project;

import com.foodDelivery.project.delivery.DeliveryDataBase;
import com.foodDelivery.project.exception.MyException;
import com.foodDelivery.project.food.Food;
import com.foodDelivery.project.food.FoodDataBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    public static void printMenu(List<Food> foodList) throws MyException, IOException {
        Order order = new Order();
        boolean userHungry = true;
        System.out.println("======Welcome to the Glovo ======\n\t\"What is your address?");
        String address = InputValue.inputValue();

        switch (address) {
            case "Pivnichna":
                List<Integer> infoPivnichna = new ArrayList(Arrays.asList(DeliveryDataBase.PIVNICHNA.getAddress(),
                        DeliveryDataBase.PIVNICHNA.getDistanceDelivery(), DeliveryDataBase.PIVNICHNA.getTimeDelivery(), DeliveryDataBase.PIVNICHNA.getCostDelivery()));
                System.out.println("1- street " + infoPivnichna.get(0) + ", " + "time of delivery - "
                        + infoPivnichna.get(1) + "min" + ", " +
                        "delivery distance - " + infoPivnichna.get(2) + "km" + ", " + "cost of delivery - " + infoPivnichna.get(3) + "$");
                String costDeliveryToPivnichna = "cost of delivery - " + infoPivnichna.get(3) + "$";
                int selectDeliveryPivnichna = Integer.parseInt(InputValue.inputValue());
                if (selectDeliveryPivnichna == 1) {
                    order.addDelivery(costDeliveryToPivnichna);
                }

                break;
            case "Polova":
                List<Integer> infoPolova = new ArrayList(Arrays.asList(DeliveryDataBase.POLOVA.getAddress(),
                        DeliveryDataBase.POLOVA.getDistanceDelivery(), DeliveryDataBase.POLOVA.getTimeDelivery(), DeliveryDataBase.POLOVA.getCostDelivery()));
                System.out.println("1- street " + infoPolova.get(0) + ", " + "time of delivery - "
                        + infoPolova.get(1) + "min" + ", " +
                        "delivery distance - " + infoPolova.get(2) + "km" + ", " + "cost of delivery - " + infoPolova.get(3) + "$");
                String costDeliveryToPolova = "cost of delivery - " + infoPolova.get(3) + "$";
                int selectDeliveryPolova = Integer.parseInt(InputValue.inputValue());
                if (selectDeliveryPolova == 1) {
                    order.addDelivery(costDeliveryToPolova);
                }
                break;
            case "Central":
                List<Integer> infoCentral = new ArrayList(Arrays.asList(DeliveryDataBase.CENTRAL.getAddress(),
                        DeliveryDataBase.CENTRAL.getDistanceDelivery(), DeliveryDataBase.CENTRAL.getTimeDelivery(), DeliveryDataBase.CENTRAL.getCostDelivery()));
                System.out.println("1- street " + infoCentral.get(0) + ", " + "time of delivery - "
                        + infoCentral.get(1) + "min" + ", " +
                        "delivery distance - " + infoCentral.get(2) + "km" + ", " + "cost of delivery - " + infoCentral.get(3) + "$");
                String costDeliveryCentral = "cost of delivery - " + infoCentral.get(3) + "$";
                int selectDeliveryCentral = Integer.parseInt(InputValue.inputValue());
                if (selectDeliveryCentral == 1) {
                    order.addDelivery(costDeliveryCentral);
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
                System.out.println("Food Menu\n" + "Press 1 - select Meats.\nPress 2 - select Salads." +
                        "\nPress 3 - select Desserts." + "\nPress 4 - select Fruits.\n" + "Press 5 - select allMenu.\n");
                System.out.print("Please make you choice: ");

                int selection = Integer.parseInt(InputValue.inputValue());

                switch (selection) {
                    case 1:
                        List<String> meats = new ArrayList(Arrays.asList(FoodDataBase.MEAT.getNameOfDish1(),
                                FoodDataBase.MEAT.getNameOfDish2(), FoodDataBase.MEAT.getNameOfDish3()));
                        System.out.println("1 - " + meats.get(0) + " " + FoodDataBase.MEAT.getPrice() + "$");
                        System.out.println("2 - " + meats.get(1) + " " + FoodDataBase.MEAT.getPrice() + "$");
                        System.out.println("3 - " + meats.get(2) + " " + FoodDataBase.MEAT.getPrice() + "$");
                        String orderBeef = meats.get(0) + " " + FoodDataBase.MEAT.getPrice() + "$";
                        String orderRibeye = meats.get(1) + " " + FoodDataBase.MEAT.getPrice() + "$";
                        String orderChicken = meats.get(2) + " " + FoodDataBase.MEAT.getPrice() + "$";
                        int selectOrderMeats = Integer.parseInt(InputValue.inputValue());
                        if (selectOrderMeats == 1) {
                            order.addOrderFood(orderBeef);
                        }
                        if (selectOrderMeats == 2) {
                            order.addOrderFood(orderRibeye);
                        }
                        if (selectOrderMeats == 3) {
                            order.addOrderFood(orderChicken);
                        }
                        order.saveOrders();
                        break;
                    case 2:
                        List<String> salads = new ArrayList(Arrays.asList(FoodDataBase.SALAD.getNameOfDish1(),
                                FoodDataBase.SALAD.getNameOfDish2(), FoodDataBase.SALAD.getNameOfDish3()));
                        System.out.println("1 - " + salads.get(0) + " " + FoodDataBase.SALAD.getPrice() + "$");
                        System.out.println("2 - " + salads.get(1) + " " + FoodDataBase.SALAD.getPrice() + "$");
                        System.out.println("3 - " + salads.get(2) + " " + FoodDataBase.SALAD.getPrice() + "$");
                        String orderCaesar = salads.get(0) + " " + FoodDataBase.SALAD.getPrice() + "$";
                        String orderMimosa = salads.get(1) + " " + FoodDataBase.SALAD.getPrice() + "$";
                        String orderGreek = salads.get(2) + " " + FoodDataBase.SALAD.getPrice() + "$";
                        int selectOrderSalads = Integer.parseInt(InputValue.inputValue());
                        if (selectOrderSalads == 1) {
                            order.addOrderFood(orderCaesar);
                        }
                        if (selectOrderSalads == 2) {
                            order.addOrderFood(orderMimosa);
                        }
                        if (selectOrderSalads == 3) {
                            order.addOrderFood(orderGreek);
                        }
                        order.saveOrders();
                        break;
                    case 3:
                        List<String> desserts = new ArrayList(Arrays.asList(FoodDataBase.DESSERT.getNameOfDish1(),
                                FoodDataBase.DESSERT.getNameOfDish2(), FoodDataBase.DESSERT.getNameOfDish3()));
                        System.out.println("1 - " + desserts.get(0) + " " + FoodDataBase.DESSERT.getPrice() + "$");
                        System.out.println("2 - " + desserts.get(1) + " " + FoodDataBase.DESSERT.getPrice() + "$");
                        System.out.println("3 - " + desserts.get(2) + " " + FoodDataBase.DESSERT.getPrice() + "$");
                        String orderPie = desserts.get(0) + " " + FoodDataBase.DESSERT.getPrice() + "$";
                        String orderCheesecake = desserts.get(1) + " " + FoodDataBase.DESSERT.getPrice() + "$";
                        String orderCake = desserts.get(2) + " " + FoodDataBase.DESSERT.getPrice() + "$";
                        int selectOrderDesserts = Integer.parseInt(InputValue.inputValue());
                        if (selectOrderDesserts == 1) {
                            order.addOrderFood(orderPie);
                        }
                        if (selectOrderDesserts == 2) {
                            order.addOrderFood(orderCheesecake);
                        }
                        if (selectOrderDesserts == 3) {
                            order.addOrderFood(orderCake);
                        }
                        order.saveOrders();
                        break;
                    case 4:
                        List<String> fruits = new ArrayList(Arrays.asList(FoodDataBase.FRUIT.getNameOfDish1(),
                                FoodDataBase.FRUIT.getNameOfDish2(), FoodDataBase.FRUIT.getNameOfDish3()));
                        System.out.println("1 - " + fruits.get(0) + " " + FoodDataBase.FRUIT.getPrice() + "$");
                        System.out.println("2 - " + fruits.get(1) + " " + FoodDataBase.FRUIT.getPrice() + "$");
                        System.out.println("3 - " + fruits.get(2) + " " + FoodDataBase.FRUIT.getPrice() + "$");
                        String orderMangosteen = fruits.get(0) + " " + FoodDataBase.FRUIT.getPrice() + "$";
                        String orderMango = fruits.get(1) + " " + FoodDataBase.FRUIT.getPrice() + "$";
                        String orderJackfruit = fruits.get(2) + " " + FoodDataBase.FRUIT.getPrice() + "$";
                        int selectOrderFruits = Integer.parseInt(InputValue.inputValue());
                        if (selectOrderFruits == 1) {
                            order.addOrderFood(orderMangosteen);
                        }
                        if (selectOrderFruits == 2) {
                            order.addOrderFood(orderMango);
                        }
                        if (selectOrderFruits == 3) {
                            order.addOrderFood(orderJackfruit);
                        }
                        order.saveOrders();
                        break;
                    case 5:
                        for (Food food : foodList) {
                            System.out.println(food);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Wrong number: " + selection);
                }

            } else {
                userHungry = false;
                System.out.println("Goodbye " + userName + " have a nice day.");
//                System.out.println("Total cost " + orderServiceImplement.calculateTotal() + " $");
            }

        }
    }
}
