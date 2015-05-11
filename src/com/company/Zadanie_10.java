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

    WebDriver dr ;


    @Before
    public void Start(){
         System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
         WebDriver dr = new ChromeDriver();
         Zadanie_10_P_O.open(dr);
    }




    @Test        //Проверка на работоспособность
    public void Test1() throws InterruptedException {

        Zadanie_10_P_O.SendKeysLeft("Hello . how are you ?");
        Zadanie_10_P_O.ClickTranslate();
        String b = "Здравствуйте. как дела?";
        Thread.sleep (2000);
        Assert.assertEquals("Проверка на работоспособность", b, Zadanie_10_P_O.GetResult());

    }

    @Test     //Проверка title

    public  void Test2(){
        String expectedTitle = "Переводчик Google";
        Assert.assertEquals(Zadanie_10_P_O.getTitle(), expectedTitle);
    }

    @Test     // Проверить наличие полей и кнопки Транслейт

    public void  Test3() throws InterruptedException {      // найти поля и кнопку

        Assert.assertEquals(true, Zadanie_10_P_O.DisplayedLeftPart());
        Assert.assertEquals(true, Zadanie_10_P_O.DisplayedRightPart());
        Assert.assertEquals(true, Zadanie_10_P_O.DisplayedButton());
    }

    @Test     // Правое поле не добавляет текст

    public void Test4(){
              boolean k = true;
              Assert.assertEquals(k,Zadanie_10_P_O.isEnableRight());
    }

    @Test   // роверка наличия языков (Греческий...)

    public  void  Test5() throws InterruptedException {

        Zadanie_10_P_O.SelectLangLeft();
        String a1 = dr.findElement(By.xpath(".//*[@id=':i']")).getText();  // взять название языка
        String b1 = dr.findElement(By.xpath(".//*[@id=':1b']")).getText();   // взять название языка
        String c1 = dr.findElement(By.xpath(".//*[@id=':1t']")).getText();   // взять название языка
        Thread.sleep(2000);
        String a = "греческий";
        String b = "мальтийский";
        String c = "словацкий";
        Assert.assertEquals(a,a1);
        Assert.assertEquals(b,b1);
        Assert.assertEquals(c,c1);
    }

    @Test  //  Проверка наличия кнопки прослушки

    public  void  Test6 () throws InterruptedException {
        Zadanie_10_P_O.SendKeysLeft("Hello");
        Zadanie_10_P_O.ClickTranslate();
        boolean k = true;
        Thread.sleep(1000);
        Assert.assertEquals(k,Zadanie_10_P_O.DisplayedVolumeButton());
    }

    @Test // Проверка что переводится Hello в другой ссылке

    public  void  Test7() throws InterruptedException {
        Zadanie_10_P_O.OpenLink();
        Zadanie_10_P_O.GetLeftField();
        Thread.sleep(1000);
        String k1 = "Привет";
        String k2 = "Hello";
        Assert.assertEquals(Zadanie_10_P_O.GetResult(),k1);
        Assert.assertEquals(Zadanie_10_P_O.GetLeftField(),k2);
    }

    @Test   // Выбрать языки , изменить местами, проверить правильность

    public  void Test8 () throws InterruptedException {
        Zadanie_10_P_O.SelectLangLeft();
        dr.findElement(By.xpath(".//*[@id=':u']")).click();
        Zadanie_10_P_O.SelectLangRight();
        dr.findElement(By.xpath(".//*[@id=':2r']")).click();
        Zadanie_10_P_O.ChangeLang();
        Zadanie_10_P_O.SendKeysLeft("Hello");
        String g = "hola";
        Thread.sleep(1000);
        Assert.assertEquals(g,Zadanie_10_P_O.GetResult());
        dr.quit();
}

    @Test    // Проверка  cross

    public  void  Test9() throws InterruptedException {
        Zadanie_10_P_O.SendKeysLeft("Hello");
        Zadanie_10_P_O.ClickCross();
        Thread.sleep(1000);
        String g1 = "";
        Assert.assertEquals(Zadanie_10_P_O.GetLeftField(),g1);
        Assert.assertEquals(Zadanie_10_P_O.GetResult(),g1);
    }

    @Test   // Выбо укр. языка и перевод

    public  void  Test10 () throws InterruptedException {
        Zadanie_10_P_O.SelectLangLeft();
        Thread.sleep(1000);
        dr.findElement(By.xpath("//div[@id=':29']")).click();
        Zadanie_10_P_O.SelectLangRight();
        Thread.sleep(1000);
        dr.findElement(By.xpath("//div[@id=':4u']")).click();
        Thread.sleep(1000);
        Zadanie_10_P_O.SendKeysLeft("С У! Г С!");
        Thread.sleep(2000);
        System.out.println(Zadanie_10_P_O.GetResult());

    }


}




