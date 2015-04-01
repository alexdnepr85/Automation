package com.company;

/**
 * Created by Никита on 01/04/15.
 */




public class TestClass {
    public  int height;
    public  int width ;
    public boolean opened;
    public boolean locked;




    public  String toString(){

    String s = "Size: " + height + "x" + width + "mm" + "\n"+
               "Opened: " + "\n" +
               "Locked: ";
        return s;



    }

    public  TestClass (int h,int w, boolean opened,boolean locked){
        this.height = h;
        this.width = w;
        this.opened = true;
        this.locked = false;


    }

    public static void main(String[] args) {
        TestClass ProDoor1 = new TestClass(2000, 1000, false, false);
        System.out.println(DoorInfo1 + "\n" + ProDoor1);

        TestClass ProDoor2 = new TestClass(3000, 2000, true, true);
        String DoorInfo2 = "Door2 Info :";

        System.out.println(DoorInfo2 + "\n" + ProDoor2);}}

