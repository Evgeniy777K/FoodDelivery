package com.foodDelivery.project.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToListOfOrders {
    public BufferedWriter bufferedWriterFood;
    public BufferedWriter bufferedWriterLocation;

    {
        try {
            bufferedWriterFood = new BufferedWriter(new FileWriter("data/listOfOrder.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    {
        try {
            bufferedWriterLocation = new BufferedWriter(new FileWriter("data/listOfOrder.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
