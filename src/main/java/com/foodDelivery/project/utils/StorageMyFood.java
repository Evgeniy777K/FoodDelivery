package com.foodDelivery.project.utils;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StorageMyFood {
    private static final Logger LOGGER = Logger.getLogger((StorageMyFood.class));

    public static List<String> getStorageFood(List<String> storageFood) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("data/foodMyMenu.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] splitLine = line.split(" ");
                int countFields = 3;
                if (splitLine.length == countFields) {
                    storageFood.addAll(Arrays.asList(splitLine));
                }
                LOGGER.info(line = reader.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return storageFood;
    }
}
