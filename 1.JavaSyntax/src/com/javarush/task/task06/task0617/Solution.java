package com.javarush.task.task06.task0617;

/* 
Блокнот для новых идей
*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea {
        public String getDescription(){
            return "^-^";
        }
    }

    public static void printIdea(Idea idea){
//        Idea goodIdea = new Idea();
        System.out.println(idea.getDescription());
    }
}
