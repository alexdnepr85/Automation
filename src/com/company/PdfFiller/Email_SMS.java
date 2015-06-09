package com.company.PdfFiller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

/**
 * Created by Никита on 06/09/15.
 */




@RunWith(JUnit4.class)
public class Email_SMS {
    public static WebDriver dr;

    @Before
    public  void Start1() throws AWTException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", Constants.ROOT_DIR_CHROME_APP);
        WebDriver dr = new ChromeDriver();
        P_O_TieredP.open1(dr);
        Thread.sleep(2000);
    }

    @After
    public void END(){
        P_O_TieredP.close();}


    // ALL BUTTONS

    public static String SearchDocument = "//td[@class='search_document']";
    public static String Field4Search = "//div [@class='body_search']//input[@class = 'input_uploader search_uploader ui-autocomplete-input']"; // Поле для ввода запроса поиска
    public static String Search = "//div [@class='body_search']//a[text()='Search']";





    @Test
    public   void  Test1 () throws InterruptedException {
        P_O_TieredP.ClickButton_xpath(SearchDocument); // Нажать поиск на аплоадере
        Thread.sleep(2000);
        P_O_TieredP.SendKeys(Field4Search,"W 9 "); // Вводим в поле "W 9"
        P_O_TieredP.ClickButton_xpath(Search);







    }


}
