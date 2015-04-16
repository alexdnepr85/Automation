package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by Никита on 08/04/15.
 *
 */

@RunWith(JUnit4.class)

public class Lesson_6_J_Unit {
    String t ;

    @After

    public void clean () {
        System.out.println(t);
        dr.quit();}

    @   Before

    public  void  pered_testom(){
        System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("http://oxogamestudio.com/passwd.current4.htm");
       // dr.get(" http://angel.net/~nic/passwd.current.html");
    }


    public  WebDriver dr;



    public  void findMaster(String s) {
        dr.findElement(By.name("master")).sendKeys(s);
    }


    public  void findSite(String s1) {
        dr.findElement(By.name("site")).sendKeys(s1);
    }

    public void  pressEnter () {
        dr.findElement(By.name("site")).sendKeys(Keys.ENTER);
    }

    public String  pole() {
        String pole1 = dr.findElement(By.name("master")).getAttribute("value");
        return pole1;
    }

    public String pole1 () {
        String pole2 = dr.findElement(By.name("site")).getAttribute("value");
        return pole2;
    }


    public  String Vozvrat () {
        String pass = dr.findElement(By.name("password")).getAttribute("value");
        return pass;
    }

    public  boolean isAnableMaster() {
        boolean k = dr.findElement(By.name("master")).isEnabled();
        return k;

    }

    public  boolean isAnableSite() {
        boolean b = dr.findElement(By.name("site")).isEnabled();
        return b;

    }
     public  boolean isAnablePass() {
         boolean t = dr.findElement(By.name("password")).isEnabled();
         return  t;
     }


/*
    @Test

    public  void  Test1(){
        t = "Test1";
        findMaster("123456");
        findSite("gmail.com");
        pressEnter();
        String expectedresult2 = "DhpO4o+PKM3qA@1a";
        Assert.assertEquals("Тест 1 упал " ,expectedresult2,Vozvrat() );

    }

    @Test

    public  void Test2 (){
        t = "Test2";
        findMaster("");
        findSite("");
        pressEnter();
        String expectedresult2 = "BaefBs8/Z/cm2@1a";
        Assert.assertEquals("Тест 2 упал " ,expectedresult2,Vozvrat() );
    }

    @Test

    public  void Test3 () {
        t = "Test3";
        int i = 0;
        for (i=0; i<200; i++ ) {
            findMaster("1");
            findSite("1");
        }
        pressEnter();
        String expectedresult2 = "aR8ztwNBbSqe5@1a";
        Assert.assertEquals("Тест 3 упал ", expectedresult2, Vozvrat());
    }


    @Test
    public  void Test4 (){
        t = "Test4";
        findMaster("!@#$%^&*((((()");
        findSite("!@#$%^&*())))))))");
        pressEnter();
        String expectedresult2 = "fwfy9LM437BKx@1a";
        Assert.assertEquals("Тест 4 упал " , expectedresult2,Vozvrat() );
    }

    @Test
    public  void Test5 (){
        t = "Test5";
        String G = dr.findElements(By.tagName("input")).get(2).getAttribute("value");
        String G1    = "Generate";
        Assert.assertEquals("Тест 5 упал " , G,G1 );
    }


    @Test
    public void  Test6 () {
        String g = "123456";
        String g1 = "gmail.com";
        findMaster(g);
        findSite(g1);
        pressEnter();
        Assert.assertEquals(g,pole());
        Assert.assertEquals(g1,pole1());
    }*/

    @Test
    public void  Test7() {
        findMaster("12345");
        findSite("gmail.com");
        pressEnter();
        boolean k = true ;
        Assert.assertEquals(k,isAnableMaster());
    }

    @Test
    public void  Test8() {
        findMaster("12345");
        findSite("gmail.com");
        pressEnter();
        boolean k = true ;
        Assert.assertEquals(k,isAnableSite());
    }

    @Test
    public void  Test9() {
        findMaster("12345");
        findSite("gmail.com");
        pressEnter();
        boolean k = true ;
        Assert.assertEquals(k,isAnablePass());
    }



}
