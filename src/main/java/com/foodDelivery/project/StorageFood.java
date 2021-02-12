package com.foodDelivery.project;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class StorageFood {
    private static final Logger LOGGER = Logger.getLogger((StorageFood.class));

    public static Map<String, Integer> getStorageFood(Map<String, Integer> storageMap) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("data/foodMenu"));
            String line = reader.readLine();
            while (line != null) {
                String[] splitLine = line.split(" ");
                if (splitLine.length == 2) {
                    storageMap.put(splitLine[0],
                            Integer.parseInt(splitLine[1]));
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
        return storageMap;
    }
}
