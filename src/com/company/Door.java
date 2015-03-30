package com.company;

import com.thoughtworks.selenium.webdriven.commands.Open;

/**
 * Created by Никита on 30/03/15.
 */
public class Door {
    public  int heigt;
    public  boolean Open;
    public Door (int h) {
        heigt = h;
    }

    public static void main(String[] args) {
        Door k = new Door(100);
        Door g = new Door(200);
        boolean Open = false;
        int p = k.heigt;
        int q = g.heigt;
        k.Open = true;
        if (p <100 ){
            System.out.println("BLYATTTTT");}
        else {
            System.out.println("zzzz");}
        if (Open != false) {
            System.out.println("Idi Nahyi ");

        }
        else {
            System.out.println("$etko");}
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
