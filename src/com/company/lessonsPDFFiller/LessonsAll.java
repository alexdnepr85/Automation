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
            P_O_Lessons.metodOne();
        }

        if (count == 2) {
            P_O_Lessons.metodTwo();
        }

        else {
            P_O_Lessons.metodThree();
        }


    }

}
