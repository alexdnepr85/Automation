package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Никита on 30/03/15.
 */
public class Mane3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
        WebDriver p = new ChromeDriver();
        p.manage().window().maximize();
        p.get("http://google.com");
        Thread.sleep(2000);
        p.quit();


}}
