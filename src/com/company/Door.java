package com.company;

/**
 * Created by Никита on 30/03/15.
 */
public class Door {
    public  int height;
    public  int width;
    public  boolean open;
    public Door (int h,int w,boolean open) {
        this.height = h;
        this.width = w;
        this.open = false;
    }

    public static void main(String[] args) {

        Door door1 = new Door(100,250,true);
        Door door2 = new Door(200,350,false);

        if (door1.height == 100 && door1.width < 260){

            System.out.println("Все ок");}

        else {
            System.out.println("2");}

        if (door1.open != false) {
            System.out.println("3");

        }
        else {
            System.out.println("4");}



    while (door2.width<355) {
        door2.width = door2.width + 1;
        System.out.println("Цикл +1"+ " = " + door2.width);

    }
    }}


