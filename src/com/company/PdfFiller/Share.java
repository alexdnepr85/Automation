package com.company.PdfFiller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.IOException;

/**
 * Created by Никита on 06/15/15.
 */

@RunWith(JUnit4.class)
public class Share {

    @Before
    public  void Start1() throws AWTException, InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", Constants.ROOT_DIR_CHROME_APP);
        WebDriver dr = new ChromeDriver();
        P_O_TieredP.OpenFirst(dr, "https://root:letmein@dev2.pdffiller.com");}


    @After
    public void END(){
        P_O_TieredP.close();}



    // Constants
    public static String SearchDocument = "//td[@class='search_document']";
    public static String Field4Search = "//div [@class='body_search']//input[@class = 'input_uploader search_uploader ui-autocomplete-input']"; // Поле для ввода запроса поиска
    public static String Search = "//div [@class='body_search']//a[text()='Search']";
    public static String FillOnline = "/html[@class=' googleChrome googleChrome']/body/div[@id='body-content-wrapper']/div[@class='wrap-inner']/div[@class='wrap']/div[@class='content-pad']/div[@id='search_web_1']/div[@id='uploader']/div[@id='body_uploader']/div[@class='body_search']/div[@id='search_main_1']/div[@id='search_results']/div[@class='item'][1]/div[@class='descr']/table/tbody/tr/td[@class='btn-wrapper']/a[@class='btn-red btn-fill']/div[@class='icon-bedit']";
    public static String FillOnline2= "//a[text()='Fillable Form W-9'] ";
    public static String LinkEditorWait = "/project/";
    public static String LinkChoiceWait = "choice";
    public static String EmailSmsButton = "//a/span[text()='Email / SMS'] ";
    public static String MyForms = "//div [@id = 'body-content-wrapper']//a[text()= 'My Forms']";
    public static String Share_MyForms = "//div [@class='sngl-btn icon_share']/div";
    public static String AddAnotherRecipient = "// section [@class='all-recipients']/button";
    public static String RecipientEmail = "//div [@class ='all-recipient__item__inner__left'] //input [@class='form-control ng-scope ng-isolate-scope ng-pristine ng-valid ng-touched']";
    public static String Email = "ageevnikitatest@gmail.com";
    public static String ShareButton = "//button [@class='btn-share pull-right']";
    public static String GoToMyForms = "//div[@class='modal-btns ng-scope']/a [@href='/en/forms.htm?target=outbox_share']";
    public static String LogOut = "//div[@class='h-ac__dropdown']/a [@href='/en/logout.htm']";














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
        Thread.sleep(5000);
        P_O_TieredP.Screenshot();
        P_O_TieredP.GetParametr(); // Добавить параметр и передать
        P_O_TieredP.WaitLink(LinkChoiceWait); //Ждать ссылку Choise
        Thread.sleep(3000);
        P_O_TieredP.Screenshot(); // Скриншот в  папке | C:\Nikita\Work\Avtomatization\Screens
        P_O_TieredP.ClickButton_id("share_link"); //Нажать на Choise
        P_O_TieredP.checkAlert();  // переключение на окно регистрации
        P_O_TieredP.Registration();  // регистрация
        P_O_TieredP.WaitLink("en/share/");
        P_O_TieredP.Screenshot();
        Thread.sleep(5000);
        P_O_TieredP.ClickButton_xpath(AddAnotherRecipient);
        P_O_TieredP.SendKeys(RecipientEmail, Email);
        P_O_TieredP.Screenshot();
        P_O_TieredP.ClickButton_xpath(ShareButton);
        P_O_TieredP.checkAlert();
        P_O_TieredP.ClickButton_xpath(GoToMyForms);
        P_O_TieredP.WaitLink("forms.htm");
        Thread.sleep(2000);
        P_O_TieredP.ClickButton_id("user_logo_thumb_header");
        P_O_TieredP.ClickButton_xpath(LogOut);
















    }


}
