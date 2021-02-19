package com.foodDelivery.project.utils;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StorageDelivery {
    private static final Logger LOGGER = Logger.getLogger((StorageDelivery.class));

    public static List<String> getStorageDelivery(List<String> storageDelivery) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("data/delivery.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] splitLine = line.split(" ");
                int countOfFields = 4;
                if (splitLine.length == countOfFields) {
                    storageDelivery.addAll(Arrays.asList(splitLine));
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
        return storageDelivery;
    }


}