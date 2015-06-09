package com.company.PdfFiller;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Никита on 06/09/15.
 */




@RunWith(JUnit4.class)
public class Email_SMS {
    public static WebDriver dr;


    @Before
    public  void Start1() throws AWTException, InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", Constants.ROOT_DIR_CHROME_APP);
        WebDriver dr = new ChromeDriver();


        P_O_TieredP.OpenFirst(dr, "https://pdffiller.com");
        Thread.sleep(2000);

    }



    @After
    public void END(){
        P_O_TieredP.close();}


    // ALL BUTTONS

    public static String SearchDocument = "//td[@class='search_document']";
    public static String Field4Search = "//div [@class='body_search']//input[@class = 'input_uploader search_uploader ui-autocomplete-input']"; // Поле для ввода запроса поиска
    public static String Search = "//div [@class='body_search']//a[text()='Search']";
    public static String FillOnline = "//a[text()='Fillable Form W-9 (Rev. December 2014)'] ";
    public static String FillOnline2= "//a[text()='Fillable Form W-9'] ";
    public static String LinkEditorWait = "/project/";
    public static String LinkEditorTest = "https://www.pdffiller.com/en/export/choice.htm";
    public static String LinkChoiceWait = "choice";
    public static String EmailSmsButton = "//a/span[text()='Email / SMS'] ";




    @Test
    public   void  Test1 () throws InterruptedException, IOException {
        P_O_TieredP.ClickButton_xpath(SearchDocument); // Нажать поиск на аплоадере
        Thread.sleep(2000);
        P_O_TieredP.SendKeys(Field4Search,"W 9 "); // Вводим в поле "W 9"
        P_O_TieredP.ClickButton_xpath(Search);  // Нажать Search
        P_O_TieredP.WaitButton(FillOnline,"Fill Online"); //Ждем Fill Online
        if (P_O_TieredP.CheckButton(FillOnline))    // Поиск ссыллок на форму и нажатие на них
        {
        P_O_TieredP.ClickButton_xpath(FillOnline);
        }
        else
        {
            P_O_TieredP.ClickButton_xpath(FillOnline2);
        }
        P_O_TieredP.WaitLink(LinkEditorWait); // Ждать ссылку
        P_O_TieredP.OpenUrl(LinkEditorTest); // открыть Link
        P_O_TieredP.WaitLink(LinkChoiceWait); //Ждать ссылку Choise
        Thread.sleep(3000);
        P_O_TieredP.Screenshot(); // Скриншот в  папке | C:\Nikita\Work\Avtomatization\Screens


















    }


}
