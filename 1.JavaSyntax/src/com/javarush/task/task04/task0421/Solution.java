//package com.javarush.task.task04.task0421;
//
///*
//Настя или Настя?
//*/
//
//import java.io.*;
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String sName1 = reader.readLine();
//        String sName2 = reader.readLine();
//        if (sName1.equals(sName2)) System.out.println("Имена идентичны");
//        else {
//            if (sName1.length() == sName2.length()) System.out.println("Длины имен равны");
//        }
//
//    }
//}
package com.javarush.task.task04.task0421;

/*
Настя или Настя?
*/

        import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
        String x = r.readLine();
        String z = r.readLine();
        int x1 = x.length();
        System.out.println(x1);
    }
}