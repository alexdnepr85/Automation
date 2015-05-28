package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Никита on 25/05/15.
 */

@RunWith(JUnit4.class)
public class Tiered_pricing {
public static  WebDriver dr;

    //usr/bin/google-chrome
    //C:/Nikita/Work/Avtomatization/chromedriver.exe

    @Before
    public  void Start1() throws AWTException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        P_O_TieredP.open1(dr);
        Thread.sleep(2000);
    }
    /*@After
    public void END(){
        P_O_TieredP.close();
    }*/





    @Test  // Регистрация нового юзера.

    public   void  Test1 () throws InterruptedException, AWTException {
        Thread.sleep(1000);
        P_O_TieredP.ClickRegister();
        P_O_TieredP.SendEmailPass();
        Thread.sleep(1000);
        P_O_TieredP.ErrorEmail();
        P_O_TieredP.WaitButton("//div[@class = 'add_new_forms_text']");
        P_O_TieredP.ClickServices();
        String k1 = "Save 66% off regular price!";
        Assert.assertEquals(k1, P_O_TieredP.CheckServices());
        P_O_TieredP.ClickSubscribeOnServices();
        P_O_TieredP.WaitButton("//li [@id ='professional']//div [@class='list-plan-item__button \" +\n" +
                "                \"list-plan-item__button_bottom annual active']//a[text()]");
       // P_O_TieredP.PrintPaymentText();
        P_O_TieredP.DeleteAccoutn();




   }



}



