package com.javarush.task.task14.task1403;

/*
Building и School
*/

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        //измените null на объект класса Building или School
        School school = new School();
        return school;
    }

    public static Building getBuilding() {
        //измените null на объект класса Building или School
        Building building = new Building();
        return building;
    }

    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building extends Object {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
