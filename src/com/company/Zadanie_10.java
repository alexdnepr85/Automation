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

import java.util.List;

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

    public  static boolean Levaya4ast (){
        WebElement k = dr.findElement(By.id("source"));
        return  k.isDisplayed();
    }

    public  static boolean Pravaya4ast() {
        WebElement k = dr.findElement(By.xpath("//span [@id='result_box']"));
        return  k.isDisplayed();
    }

    public  static  boolean ButtonTransl(){
        WebElement k = dr.findElement(By.id("gt-submit"));
        return  k.isDisplayed();
    }

    public  static  boolean VolumeBtn () {
        WebElement k = dr.findElement(By.xpath("//div[@class='trans-listen-button goog-toolbar-button']"));
        return k.isDisplayed();
    }

public void   LevoePole (String t){
    dr.findElement(By.id("source")).sendKeys(t);
}










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

    public void  Test3() {      // найти поля и кнопку

        Assert.assertEquals(true, Levaya4ast());
        Assert.assertEquals(true, Pravaya4ast());
        Assert.assertEquals(true, ButtonTransl());




          @Test     // нет возможности ввести значения в поле перевода
        public void Test4(){
              boolean k = true;
              Assert.assertEquals(k,isEnablePravoe());
    }

    @Test
    public  void  Test5() throws InterruptedException {
        dr.findElement(By.id("gt-sl-gms")).click();
        String f= dr.findElement(By.xpath(".//*[@id=':i']")).getText();
        String f1 = dr.findElement(By.xpath(".//*[@id=':1b']")).getText();
        String f2 = dr.findElement(By.xpath(".//*[@id=':1t']")).getText();
        Thread.sleep(2000);
        String a = "греческий";
        String b = "мальтийский";
        String c = "словацкий";
       Assert.assertEquals(a,f);
        Assert.assertEquals(b,f1);
        Assert.assertEquals(c,f2);

    }

    public static String getMasterLabel() {

        String s = td.get(0).getText();
        return s;
        static List<WebElement> td = dr.findElements(By.tagName("td"));


    }

    @Test
    public  void  Test6 () throws InterruptedException {
        dr.findElement(By.id("source")).sendKeys("Hello");
        dr.findElement(By.id("gt-submit")).click();
        boolean k = true;
        Thread.sleep(1000);
        Assert.assertEquals(k,VolumeBtn());
    }



    @Test
    public  void  Test7() throws InterruptedException {
        dr.get("https://translate.google.com/#auto/en/Hello");
        String k = dr.findElement(By.id("source")).getText();
        Thread.sleep(1000);
        String k1 = "Привет";
        String k2 = "Hello";
        Assert.assertEquals(perevod(),k1);
        Assert.assertEquals(k,k2);
    }


    @Test
    public  void Test8 () throws InterruptedException {
        dr.findElement(By.id("gt-sl-gms")).click();
        dr.findElement(By.xpath(".//*[@id=':u']")).click();
        dr.findElement(By.id("gt-tl-gms")).click();
        dr.findElement(By.xpath(".//*[@id=':2r']")).click();
        dr.findElement(By.id("gt-swap")).click();
        LevoePole("Hello");
        String g = "hola";
        Thread.sleep(1000);
        String k=  dr.findElement(By.xpath("//span [@id='result_box']")).getText();
        Assert.assertEquals(g,k);
}

    @Test
    public  void  Test9() throws InterruptedException {
        LevoePole("Hello");
        dr.findElement(By.id ("gt-clear")).click();
        Thread.sleep(1000);
        String g = dr.findElement(By.id("source")).getText();
        String g3 = dr.findElement(By.id("result_box")).getText();
        String g1 = "";
        Assert.assertEquals(g,g1);
        Assert.assertEquals(g3,g1);


    }

    @Test
    public  void  Test10 () throws InterruptedException {
        dr.findElement(By.id("gt-sl-gms")).click();
         dr.findElement(By.xpath(".//*[@id=':25']")).click();
        dr.findElement(By.id("gt-tl-gms")).click();
        dr.findElement(By.xpath(".//*[@id=':4o']")).click();
        dr.findElement(By.id("source")).sendKeys("С У! Г С!");
        Thread.sleep(2000);
        String k=  dr.findElement(By.xpath("//span [@id='result_box']")).getText();
        System.out.println(k);
}






    }




