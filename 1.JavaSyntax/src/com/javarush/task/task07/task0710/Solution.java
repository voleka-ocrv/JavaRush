package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            array.add(0, reader.readLine());
        }
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
}
