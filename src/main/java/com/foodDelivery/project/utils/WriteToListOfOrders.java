package com.foodDelivery.project.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToListOfOrders {
    public BufferedWriter bw;
    public BufferedWriter bufferedWriter;

    {
        try {
            bw = new BufferedWriter(new FileWriter("data/listOfOrder.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("data/listOfOrder.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
