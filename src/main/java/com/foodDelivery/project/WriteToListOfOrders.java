package com.foodDelivery.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class  WriteToListOfOrders {
    BufferedWriter bw;
    BufferedWriter bufferedWriter;

    {
        try {
            bw = new BufferedWriter(new FileWriter("data/listOfOrders", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("data/listOfOrders", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
