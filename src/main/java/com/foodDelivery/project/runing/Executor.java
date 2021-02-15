package com.foodDelivery.project.runing;


import com.foodDelivery.project.client.ClientMenu;
import com.foodDelivery.project.exception.MyException;
import com.foodDelivery.project.menu.Menu;
import com.foodDelivery.project.utils.JsonExecute;
import org.apache.log4j.Logger;

import java.io.IOException;

public class Executor {
    private final static Logger LOGGER = Logger.getLogger(Executor.class);

    public static void main(String[] args) throws MyException, IOException {
        Menu.printMyMenu();


        JsonExecute jsonAction = new JsonExecute();

        String jsonStr = jsonAction.convertJavaToJsonStr(ClientMenu.printClientMenu());
        LOGGER.info(jsonStr);
        LOGGER.info("================");
        jsonAction.convertJavaToJsonFile(jsonStr, "orderClient.json");


    }
}
