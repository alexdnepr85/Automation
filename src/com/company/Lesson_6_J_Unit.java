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

    @Before    // Будет выполняться перед каждой функцией , можно поставить в начало .

    public  void  pered_testom(){
        System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get(" http://angel.net/~nic/passwd.current.html");

    }


    public  WebDriver dr;

    @Test

    public void  Test1( ){
        t = "Test1";
        Assert.fail();               //   завалить тест
    }

    @Test                       // необходимо всегда писать @Test  чтобы запустить функции по одиночке и выполнить
                                //   действия по отдельности друг от друга
    public  void Test2() {
        t = "Test2";
        int a =10 ;
        int b = 5;
        int expectedResult =15;
        Assert.assertEquals(" Тащи  ! " ,expectedResult, a + b);
                                                                    // класс Assert , в котором есть функции .
    }

    @Test

    public  void  Test3(){
        t = "Test3";
        String j1 = "123456";
        String j2 = "gmail.com";
        dr.findElement(By.name("master")).sendKeys(j1);
        dr.findElement(By.name("site")).sendKeys(j2, Keys.ENTER);
        String G = dr.findElement(By.name("password")).getAttribute("value");
        String expectedresult2 = "DhpO4o+PKM3qA@1a";
        Assert.assertEquals("Тест 3 упал " ,expectedresult2,G );

    }

    @Test

    public  void Test4 (){
        t = "Test4";
        dr.findElement(By.name("master")).sendKeys();
        dr.findElement(By.name("site")).sendKeys(Keys.ENTER);
        String G = dr.findElement(By.name("password")).getAttribute("value");
        String expectedresult2 = "BaefBs8/Z/cm2@1a";
        Assert.assertEquals("Тест 4 упал " ,expectedresult2,G );
    }

    @Test

    public  void Test5 () {
        t = "Test5";
        String y = "gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg" +
                    "ggggggggggggggggggggggggggggggggggggggggggggggggg" +
                     "ggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggghgsdjngknsdvs" +
                      "dvsdvsdvsdvsdvsdvsdvsd";
        String y1 = "cssssssssssssssssacvasdcdnhjvefbjdjbvcdnmbvhaefjnbvjhefabfebefbgrbdfbf" +
                     "dbfdvdfvdfvfdhuiggerngjerngnerjignerjkgnjkergergergergergergergergergergergergregre";

        dr.findElement(By.name("master")).sendKeys(y);
        dr.findElement(By.name("site")).sendKeys(y1, Keys.ENTER);
        String G = dr.findElement(By.name("password")).getAttribute("value");
        String expectedresult2 = "csof9AAQSzhjv@1a";
        Assert.assertEquals("Тест 5 упал ", expectedresult2, G);
    }


    @Test
    public  void Test6 (){
        t = "Test6";
        String y1 = "!@#$%^&*((((()";
        String y2 = "!@#$%^&*())))))))";
        dr.findElement(By.name("master")).sendKeys(y1);
        dr.findElement(By.name("site")).sendKeys(y2,Keys.ENTER);
        String G = dr.findElement(By.name("password")).getAttribute("value");
        String expectedresult2 = "fwfy9LM437BKx@1a";
        Assert.assertEquals("Тест 6 упал " , expectedresult2,G );
    }

    @Test
    public  void Test7 (){
        t = "Test7";
        String G = dr.findElements(By.tagName("input")).get(2).getAttribute("value");
        String G1    = "Generate";
        Assert.assertEquals("Тест 7 упал " , G,G1 );




}}
