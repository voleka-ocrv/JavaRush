package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

public class Solution {
    public static void main(String[] args) {

    }

    static class MyException extends RuntimeException {         //unchecked
    }

    static class MyException2 extends RuntimeException{        //unchecked
    }

    static class MyException3 extends Exception{        //checked
    }

    static class MyException4 extends Exception{        //checked
    }
}

