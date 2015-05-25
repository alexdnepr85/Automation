package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Никита on 25/05/15.
 */

@RunWith(JUnit4.class)
public class Tiered_pricing {

    @Before
    public void Start1(){
        System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        P_O_TieredP.open1(dr);
    }

    @After
    public void END(){
        P_O_TieredP.close();
    }


    @Test

    public  void Test1 () {


    }


}
