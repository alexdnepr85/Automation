package com.company;

/**
 * Created by Никита on 02/04/15.
 */
public class Stakan1 {

    public String name;
    public static String Material = "bumaga";   // переменные класса , поля класса
    public static  int Vysota = 10;
    public  int procentZapolnennost;



    public Stakan1(String name ) {            // конструктор класса
         this.name = name;
    }


    public void  Nalit (int n) {
        procentZapolnennost = n + procentZapolnennost;  // metod

    }

    public int procentZapolnennost() {                  // metod

        return procentZapolnennost;

    }

    public  void  Vilit () {
        int v =  procentZapolnennost;
        procentZapolnennost = 0;

    }




    public static void main(String[] args) {
        Stakan1 s = new Stakan1("Supper");               // объект
        Stakan1 k = new Stakan1("Bigger");
        System.out.println("S: " + s.name);
        System.out.println("K: " + k.name);
        s.Nalit(30);
        s.Nalit(20);
        System.out.println("Stakan: " + Stakan1.Material);
        System.out.println("Stakan: " + Stakan1.Vysota);
        System.out.println("s: " + s.procentZapolnennost());
        //s.Nalit(30);
    }




}

