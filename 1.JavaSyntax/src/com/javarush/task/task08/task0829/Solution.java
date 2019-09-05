package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> addresses = new HashMap<String, String>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.put(city, family);
        }

        System.out.println("Введите искомый город");
        String findedCity = reader.readLine();
        for (Map.Entry<String, String> pair : addresses.entrySet()){
            if (pair.getKey().equals(findedCity)) {
                System.out.println(pair.getValue());
                break;
            }
            else {
                System.out.println("По вашему запросу ничего не найдено");
                break;
            }
        }
    }
}
