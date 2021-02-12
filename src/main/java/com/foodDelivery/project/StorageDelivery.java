package com.foodDelivery.project;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class StorageDelivery {
    private static final Logger LOGGER = Logger.getLogger((StorageDelivery.class));

    public static Map<String, Integer> getStorageDelivery(Map<String, Integer> storageDelivery) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("data/delivery"));
            String line = reader.readLine();
            while (line != null) {
                String[] splitLine = line.split(" ");
                if (splitLine.length == 2) {
                    storageDelivery.put(splitLine[0],
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
        return storageDelivery;
    }


}