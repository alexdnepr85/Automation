package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Никита on 06/04/15.
 */
public class Lesson_5 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
        WebDriver p = new ChromeDriver();
        p.manage().window().maximize();
        p.get (" http://angel.net/~nic/passwd.current.html");
        WebElement s = p.findElement(By.name("master"));
        s.sendKeys("123456789");
        s = p.findElement(By.name("site"));
        s.sendKeys(Keys.ENTER);
        String K = p.findElement(By.name("password")).getAttribute("value");
        System.out.println(K);



        //p.quit();






    }}
