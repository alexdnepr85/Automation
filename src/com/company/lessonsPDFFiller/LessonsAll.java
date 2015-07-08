package com.company.lessonsPDFFiller;

import java.util.Scanner;

/**
 * Created by Никита on 07/07/15.
 */
public class LessonsAll {

    public static void main (String[] args) {

        Scanner sr = new Scanner(System.in); // ввод из консоли
        System.out.println("Метод 1:  int -> char ");
        System.out.println("Метод 2:  float -> char ");
        System.out.println("Метод 3:  float -> char -> int ");
        System.out.print("Введите номер метода : ");
        int count = sr.nextInt(); // считать int
        if (count == 1 ) {
            System.out.print("Введите число int : ");
            int count1 = sr.nextInt();
            char count2 = (char) (count1);
            System.out.println("Char = " + count2);
        }

        if (count == 2) {
            System.out.print("Введите число float : ");
            float count1 = sr.nextInt();
            char count2 = (char) (count1);
            System.out.println("Char = " + count2);
        }

        else {
            System.out.print("Введите число float : ");
            float count1 = sr.nextInt();
            char count2 = (char) (count1);
            int count3 = (int) count2;
            System.out.println("Integer = " + count3);
        }





    }

}
