package com.foodDelivery.project.utils;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class StorageDelivery {
    private static final Logger LOGGER = Logger.getLogger((StorageDelivery.class));

    public static List<String> getStorageDelivery(List<String> storageDelivery) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("data/delivery"));
            String line = reader.readLine();
            while (line != null) {
                String[] splitLine = line.split(" ");
                if (splitLine.length == 4) {
                    storageDelivery.add(splitLine[0]);
                    storageDelivery.add(String.valueOf(Integer.parseInt(splitLine[1])));
                    storageDelivery.add(String.valueOf(Integer.parseInt(splitLine[2])));
                    storageDelivery.add(String.valueOf(Integer.parseInt(splitLine[3])));
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