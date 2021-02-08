package com.foodDelivery.project.runing;


import com.foodDelivery.project.json.JsonExecute;
import com.foodDelivery.project.controllers.FoodController;
import com.foodDelivery.project.exception.MyException;
import com.foodDelivery.project.food.Food;
import com.foodDelivery.project.food.FoodDataBase;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class Executor {
    private final static Logger LOGGER = Logger.getLogger(Executor.class);

    public static void main(String[] args) throws MyException, IOException {
        FoodController foodController = new FoodController();
        foodController.start();
        foodController.findAll();

        List<Food> foodDB = FoodDataBase.fromFoodDataBase();

        LOGGER.info(foodDB);
        LOGGER.info("=============");

        JsonExecute jsonAction = new JsonExecute();

        String jsonStr = jsonAction.convertJavaToJsonStr(foodDB);
        LOGGER.info(jsonStr);
        LOGGER.info("================");
        jsonAction.convertJavaToJsonFile(foodDB, "foodDataBase.json");


    }


}
