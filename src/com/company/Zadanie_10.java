package com.company;

import com.thoughtworks.selenium.condition.Text;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

/**
 * Created by Никита on 08/05/15.
 */

@RunWith(JUnit4.class)
public class Zadanie_10 {
    public static
    WebDriver dr;

    @After
    public void clean () {
        dr.quit();}


    @Before
            public void pered(){
            System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
     dr = new ChromeDriver();
    dr.manage().window().maximize();
    dr.get("https://translate.google.ru/");

        }

    public static String perevod(){    //взять текст из поля перевода
        String perevod1 = dr.findElement(By.xpath("//span [@id='result_box']")).getText();
        return perevod1;
    }

    public static boolean isEnablePravoe() {  // нельзя ввести символы в правую колонку
       boolean t =  dr.findElement(By.xpath("//span [@id='result_box']")).isEnabled();
        return t;
    }

/*
    @Test
    public void Test1() throws InterruptedException {         //Проверка на работоспособность

        dr.findElement(By.id("source")).sendKeys("Hello . how are you ? ");
        dr.findElement(By.id("gt-submit")).click();
        String b = "Здравствуйте. как дела?";
         Thread.sleep (2000);
        Assert.assertEquals("Проверка на работоспособность", b, perevod());
    }

    @Test

    public void  Test2(){               //Проверка title
        String actualTitle = dr.getTitle();
        String expectedTitle = "Переводчик Google";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test

    public void  Test3()  {      // найти поля и кнопку

       WebElement k = dr.findElement(By.id("source"));

        if (true) {
            System.out.println("Первое поле нашли");
        } else {
            System.out.println("Не нашли первое поле");}

        if (dr.findElement(By.id("source")).isDisplayed()) {
            System.out.println("Первое поле нашли");}
        else{
            System.out.println("Не нашли первое поле");}



    if (dr.findElement(By.xpath("//span [@id='result_box']")).isDisplayed()) {
        System.out.println("Второе поле нашли");}
    else{
        System.out.println("Не нашли Второе поле");}


        if (dr.findElement(By.id("gt-submit")).isDisplayed()) {
            System.out.println("Кнопку нашли");}
        else{
            System.out.println("Не нашли кнопку");}


}


          @Test     // нет возможности ввести значения в поле перевода
        public void Test4(){
              boolean k = true;
              Assert.assertEquals(k,isEnablePravoe());
    }*/

    @Test
    public  void  Test5(){

    }




    }



