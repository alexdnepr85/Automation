package com.company;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Никита on 25/05/15.
 */
public class P_O_TieredP {

    public  static WebDriver dr ;

    public  static  void  open1 (WebDriver dr) {

        P_O_TieredP.dr = dr;
        dr.manage().window().maximize();
        dr.get("https://denise.pdffiller.com/en/forms.htm");
    }

    public  static  void  close () {
        dr.close();
    }


    public static  void checkAlert() throws AWTException {
        try {
            WebDriverWait wait = new WebDriverWait(dr, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = dr.switchTo().alert();
            alert.accept();
        } catch (Exception e) {

        }

        Robot robot = new Robot();
        Alert alert=dr.switchTo().alert();
        dr.get("https://denise.pdffiller.com/en/forms.htm");
        alert.sendKeys("root");
        dr.switchTo().alert();
        robot.keyPress(KeyEvent.VK_TAB);
        alert.sendKeys("letmein");
        alert.accept();
}}
