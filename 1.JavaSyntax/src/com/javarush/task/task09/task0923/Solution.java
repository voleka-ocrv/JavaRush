package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] strintToCharArray = reader.readLine().toCharArray();
        ArrayList<Character> vowel = new ArrayList<Character>();
        ArrayList<Character> consonant = new ArrayList<Character>();
        for (char letter : strintToCharArray){
            if (isVowel(letter)) {
                vowel.add(letter);
            } else if (letter != ' ') {
                    consonant.add(letter);
            }
        }
        for (char letter : vowel){
            System.out.print(letter + " ");
            }
        System.out.println();
        for (char letter : consonant){
            System.out.print(letter + " ");
            }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}