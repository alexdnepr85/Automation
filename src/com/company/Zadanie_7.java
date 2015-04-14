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
 * Created by Никита on 14/04/15.
 */
@RunWith(JUnit4.class)

public class Zadanie_7 {



    @Before



    public  void  Chrome(){
        WebDriver brow;
        System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
        ChromeDriver brow = new ChromeDriver();
        brow.manage().window().maximize();
        brow.get(" http://angel.net/~nic/passwd.current.html");
        WebElement masterField = dr.findElement(By.name("master"));
        WebElement siteField = dr.findElement(By.name("site"));

    }


}
