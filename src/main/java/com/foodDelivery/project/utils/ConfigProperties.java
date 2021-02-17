package com.foodDelivery.project.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;

    static {
        try {
            //Specifying the path to the file with settings
            fileInputStream = new FileInputStream("src/main/resources/properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            //handling possible exception
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    /**
     * method for returning a string with a value from a file with settings
     */
    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}
