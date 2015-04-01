package com.company;

/**
 * Created by Никита on 01/04/15.
 */




public class TestClass {
    public  int height;
    public  int width ;
    public boolean isOpened;
    public boolean isLocked;


        public  String toString(){

    String s = "Size: " + height + " x " + width + " mm" + "\n"+
               "Opened: " + isOpened  +
                "\n"  + "Locked: " + isLocked;
        return s;
        }

    public  TestClass (int h,int w, boolean isOpened,boolean isLocked){
        this.height = h;
        this.width = w;
        this.isOpened = isOpened;
        this.isLocked = isLocked;

    }

    public static void main(String[] args) {

        TestClass ProDoor1 = new TestClass(2000, 1000, false, false);
        String ProDoor = ProDoor1.toString();


        System.out.println("Door1 info: " + "\n" + ProDoor1 + "\n");



        TestClass ProDoor2 = new TestClass(3000, 2000, true, true);
        String ProDoor2info = ProDoor2.toString();

        System.out.println("DoorInfo2: " + "\n" + ProDoor2info);}}

