package com.javarush.task.task04.task0401;

/* 
Мне не подходит этот возраст…
*/
public class Solution {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age); //5. Метод main должен вызывать метод adjustAge только один раз.
        System.out.println("Adjusted age is: " + person.age);
    }

    public static class Person {
        public int age = 20; //2. Класс Person должен иметь публичное поле age типа int.

        public void adjustAge(int age) {
            //4. Метод adjustAge класса Person должен иметь только один параметр age типа int и
            //тип возвращаемого значения void.
            this.age = this.age + 20;
            System.out.println("Age in adjustAge() is: " + age); //3. Метод adjustAge класса Person должен выводить текст на экран.
        }
    }
}
