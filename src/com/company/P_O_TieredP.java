package com.company;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.NoSuchElementException;

/**
 * Created by Никита on 25/05/15.
 */
public class P_O_TieredP {

    public  static WebDriver dr ;

    public  static  void  open1 (WebDriver dr) {

        P_O_TieredP.dr = dr;
        dr.manage().window().maximize();
        dr.get("https://root:letmein@dev28.pdffiller.com/en/login.htm");
    }

    public  static  void  close () {
        dr.close();
    }  // закрыть браузер

    public static void ClickRegister () { // нажатие Register
        dr.findElement(By.xpath("//div//a[@class= 'btn-gray btns1']")).click();
    }


    public static  void  SendEmailPass (){  // передача мыла и пароля
        dr.findElement(By.xpath("//div//td/input[@class = 'placeholders input old_vers2 grad-input']")).sendKeys(
                "ageevnikitatest+tief33fvds@gre.gre"
        );
        dr.findElement(By.xpath("//div//td/input[@class = 'placeholders old_vers2 input grad-input']")).sendKeys(
                "1111"
        );
        dr.findElement(By.id("register_btn_site")).click();
    }


    public static boolean WaitButton (String xpath){ //   для ожидания элемента на странице по xpath

        try{
            new WebDriverWait(dr,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        }catch (TimeoutException e){
            System.out.println("Element still not visible after 10 seconds!");
            return false;
        }
        return true;
    }






    }
