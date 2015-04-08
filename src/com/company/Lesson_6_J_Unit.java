package com.company;

import org.junit.Assert;
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
    @Test

    public void  Test1( ){
        Assert.fail();
    }

    @Test                       // необходимо всегда писать @Test  чтобы запустить функции по одиночке и выполнить
                                //   действия по отдельности друг от друга
    public  void Test2() {
        int a =10 ;
        int b = 6;
        int expectedResult =15;
        Assert.assertEquals(" Тащи  ! " ,expectedResult, a + b);
                                                                    // класс Assert , в котором есть функции .
    }

    @Test

    public  void  Test3(){
        System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
        WebDriver p = new ChromeDriver();
        p.manage().window().maximize();
        p.get(" http://angel.net/~nic/passwd.current.html");
        String j1 = "123456";
        String j2 = "gmail.com";
        p.findElement(By.name("master")).sendKeys(j1);
        p.findElement(By.name("site")).sendKeys(j2, Keys.ENTER);
        String G = p.findElement(By.name("password")).getAttribute("value");
        String expectedresult2 = "DhpO4o+PKM3qA@1a";
        Assert.assertEquals("Все работает " ,expectedresult2,G );
        p.quit();

    }

}
