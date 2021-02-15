package com.foodDelivery.project.utils;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class StorageMyFood {
    private static final Logger LOGGER = Logger.getLogger((StorageMyFood.class));

    public static List<String> getStorageFood(List<String> storageFood) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("data/foodMenu"));
            String line = reader.readLine();
            while (line != null) {
                String[] splitLine = line.split(" ");
                if (splitLine.length == 3) {
                    storageFood.add(splitLine[0]);
                    storageFood.add(String.valueOf(Integer.parseInt(splitLine[1])));
                    storageFood.add(String.valueOf(Integer.parseInt(splitLine[2])));
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
