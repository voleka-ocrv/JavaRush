package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(InputStreamReader(System.in));
        //строки 1-10
//        int j = 1;
        for (int i = 1; i <= 10; i++) {
            //количество 8ок
//            while (j)
            for (int j = 1; j <= i; j++)
                System.out.print(8);
            System.out.println();
        }
    }
}
