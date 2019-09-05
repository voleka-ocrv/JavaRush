package com.javarush.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/*
Время для 10 тысяч вставок
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));

    }

    public static long getInsertTimeInMs(List list) throws InterruptedException {
        Date beginDate = new Date();
        insert10000(list);
        Date endDate = new Date();

        //System.out.println(endDate.getTime() - beginDate.getTime());
        return (endDate.getTime() - beginDate.getTime());
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
