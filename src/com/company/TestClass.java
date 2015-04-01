package com.company;

/**
 * Created by Никита on 01/04/15.
 */
public class TestClass {
    public  int height = 2000;
    public  int width = 1000;
    public boolean opened;
    public boolean locked;

    public  TestClass (int h,int w, boolean opened,boolean locked){
        this.height = h;
        this.width = w;
        this.opened = true;
        this.locked = false;


    }

    public static void main(String[] args) {
        TestClass ProDoor1 = new TestClass(2000, 1000, true, false);
        String DoorInfo1 = "Door1 Info :";

        System.out.println(DoorInfo1 + "\n" + ProDoor1);

        TestClass ProDoor2 = new TestClass(2000, 1000, true, false);
        String DoorInfo2 = "Door2 Info :";

        System.out.println("Door_2 info:\n" + ProDoor2);

    }
}
