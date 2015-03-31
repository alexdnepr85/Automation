package com.company;

import com.thoughtworks.selenium.webdriven.commands.Open;

/**
 * Created by Никита on 30/03/15.
 */
public class Door {
    public  int height;
    public  int width;
    public  boolean open;
    public Door (int h,int w) {
        this.height = h;
        this.width = w;
        this.open = false;
    }

    public static void main(String[] args) {
        Door k = new Door(100,250);
        Door g = new Door(200,350);
        k.open = true;
        if (k.height <100 ){
            System.out.println("1");}
        else {
            System.out.println("2");}

        if (k.open != false) {
            System.out.println("3");

        }
        else {
            System.out.println("4");}
        }
    }






    /*public int height;
    public int width;
    public  boolean Open;

    public Door(int h) {
        height=h;
        Open = true;
    }

    public static void main(String[] args) {

        Door r = new Door(100);
        Door k = new Door(200);
        int d = r.height;
        int p = k.width;
        r.Open= true;
    }



    }

      }






/*{
    public int height;
    public int width;
    public boolean isOpened;
    public  Door(int h){
        height = h;
        isOpened = false;
    }
    Door k = new Door(100);
int d = k.height;
k.isOpened=true;

        if (k.isOpened) {
        System.out.println("Open");
        }
        else {
        System.out.println("Close");*/
