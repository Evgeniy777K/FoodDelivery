package com.foodDelivery.project.utils;


import com.foodDelivery.project.exception.MyException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputValue {
    public static String inputValue() throws MyException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new MyException(e.getMessage());
        }
    }
}
