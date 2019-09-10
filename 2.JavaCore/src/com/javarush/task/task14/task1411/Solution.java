package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        List<String> list = Arrays.asList("user", "loser", "coder", "proger");

        key = reader.readLine();
        while (list.contains(key)) {
            switch (key) {
                case ("user"):
                    person = new Person.User();
                    break;
                case ("loser"):
                    person = new Person.Loser();
                    break;
                case ("coder"):
                    person = new Person.Coder();
                    break;
                case ("proger"):
                    person = new Person.Proger();
                    break;
            }
            doWork(person);
            key = reader.readLine();
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) ((Person.User) person).live();
        if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        if (person instanceof Person.Coder) ((Person.Coder) person).writeCode();
        if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
    }
}
