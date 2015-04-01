package com.company;

/**
 * Created by Никита on 01/04/15.
 */




public class TestClass {
    public  int height;           // свойства
    public  int width ;           // свойства
    public boolean isOpened;      // свойства
    public boolean isLocked;      // свойства

    public  TestClass (int h,int w, boolean isOpened,boolean isLocked){    // конструктор
        this.height = h;                                                   // конструктор
        this.width = w;                                                   // конструктор
        this.isOpened = isOpened;                                        // конструктор
        this.isLocked = isLocked;                                         // конструктор

    }


        public  String toString(){

    String s = "Size: " + height + " x " + width + " mm" + "\n"+        // метод
               "Opened: " + isOpened  +                                 // метод   (что-то выполняет)
                "\n"  + "Locked: " + isLocked;                         // метод
        return s;                                                     // результат метода
        }



    public static void main(String[] args) {

        TestClass ProDoor1 = new TestClass(2000, 1000, false, true);
        String ProDoor = ProDoor1.toString();                               // программа


        System.out.println("Door1 info: " + "\n" + ProDoor1 + "\n");



        TestClass ProDoor2 = new TestClass(3000, 2000, true, false);
        String ProDoor2info = ProDoor2.toString();

        System.out.println("DoorInfo2: " + "\n" + ProDoor2info);}}

