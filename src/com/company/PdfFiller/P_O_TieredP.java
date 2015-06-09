package com.company.PdfFiller;

import com.thoughtworks.selenium.webdriven.commands.GetText;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Никита on 25/05/15.
 */
public class P_O_TieredP {

    public  static WebDriver dr ;

    public  static  void  open1 (WebDriver dr) {





        P_O_TieredP.dr = dr;
        dr.manage().window().maximize();
        dr.get("https://pdffiller.com");}


    //https://root:letmein@dev28.pdffiller.com/en/login.htm







    public  static  void  close () {
        dr.close();
    }  // закрыть браузер


    public static void  Registration () throws InterruptedException {
        if (Displayed_any_ByXpath("//div [@class = 'login-offset2']/a")){
        ClickButton_xpath("//div//a[@class= 'btn-gray btns1']"); // register button
        SendEmailPass();
        Thread.sleep(1000);
        ErrorEmail();
        WaitButton("//div[@class = 'add_new_forms_text']", "Add New Form"); // Ожидание Add New Form button
    }
    else {
            SendEmailPass();
            Thread.sleep(1000);
            ErrorEmail();
            WaitButton("//div[@class = 'add_new_forms_text']", "Add New Form");
        }
    }

    public static void ClickButton_id (String id) { // нажатие Register
        dr.findElement(By.id(id)).click();
    }


    public static void ClickButton_xpath (String xpath) { // нажатие Register
        dr.findElement(By.xpath(xpath)).click();
    }

    public static void SendKeys (String xpath, String text) { // нажатие Register
        dr.findElement(By.xpath(xpath)).sendKeys(text);
    }





    public static boolean Displayed_any_ByXpath (String xpath){  // отображение элемента на стр

        try {
            WebElement k = dr.findElement(By.xpath(xpath));
            return k.isDisplayed();}
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;}
    }


    public static  void  SendEmailPass () throws InterruptedException {  // передача мыла и пароля

        int k = 1;
        SendKeys("//div//td/input[@class = 'placeholders input old_vers2 grad-input']","ageevnikitatest+AvtTest" + k + "@gmail.com" );
        SendKeys("//div//td/input[@class = 'placeholders old_vers2 input grad-input']", "1111");
        ClickButton_id("register_btn_site");

    }

    public  static void  ErrorEmail() throws InterruptedException { // подбор имейла , если не подошел . цикл

        int  k= 2;
        while (Displayed_any_ByXpath( "//div [@class = 'login-offset2']/a")) {
            ClickButton_xpath("//div[@class= 'log_reg']");
            SendKeys("//div//td/input[@class = 'placeholders input old_vers2 grad-input']","ageevnikitatest+AvtTest" + k + "@gmail.com" );
            SendKeys("//div//td/input[@class = 'placeholders old_vers2 input grad-input']","1111" );
            ClickButton_id("register_btn_site");
            k = k+1;
            Thread.sleep(2000);}

    }



    public static boolean CheckButton (String xpath){

        try {
            dr.findElement(By.xpath(xpath));
            return  true;
            }

        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;}
    }

            //!dr.getCurrentUrl().contains("forms.htm")    взять ссылку сравнить с частью
            //    "//div [@class = 'login-offset2']/a "   Genera



    public static boolean WaitButton (String xpath,String p){ //   для ожидания элемента на странице по xpath

        try{
            new WebDriverWait(dr,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        }catch (TimeoutException e){
            System.out.println("No such element: "+ p );
            return false;
        }
        return true;

    }



    public static String Get_Text  (String xpath ) {
       String k =  dr.findElement(By.xpath(xpath)).getText();
        return k;
    }



    public static void CheckText (String expected,String xpath){
        try {

            Assert.assertEquals(expected, Get_Text(xpath));
        }
        catch (org.junit.ComparisonFailure e ) {
            System.out.println( "Incorrect text : " + expected);
        }}






    public  static void If_Get_Text(String url) {

        if (CheckButton(url)){
                System.out.println("Text : " + Get_Text(url));}}



    public static void   DeleteAccoutn () throws InterruptedException {
        if (!dr.getCurrentUrl().contains("#payment_cc")){
        ClickButton_xpath(".//a [text()='My Account']");
        ClickButton_xpath(".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]");

        if  (CheckButton("//a [@href='/en/account/?op=payment_options']")){
            ClickButton_xpath("//a [@href='/en/account/?op=payment_options']");
            Thread.sleep(2000);
            ClickButton_xpath("//a [@href='/en/account/?op=cancel_bt']");

      if (CheckButton("//div [@class = 'new-btn btn--light-gray cancel-button']")){
            ClickButton_xpath("//div [@class = 'new-btn btn--light-gray cancel-button']");
            ClickButton_xpath(".//a [text()='My Account']");
            ClickButton_xpath(".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]");
            ClickButton_xpath(".//div [@class='p1'] /a");
            checkAlert();
          System.out.println("Account Delete");}



          else if (CheckButton("//a [@href='/en/payment/subscription_cancel.htm?v=interview']")) {
            ClickButton_xpath("//a [@href='/en/payment/subscription_cancel.htm?v=interview']");
            ClickButton_xpath(".//a [text()='My Account']");
            ClickButton_xpath(".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]");
            ClickButton_xpath(".//div [@class='p1'] /a");
            checkAlert();
          System.out.println("Account Delete");}


        else {
            Thread.sleep(2000);
        ClickButton_xpath(".//a [text()='My Account']");
        ClickButton_xpath(".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]");
        ClickButton_xpath(".//div [@class='p1'] /a");
        checkAlert();
            System.out.println("Account Delete ");}}}}



    public static  void checkAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(dr, 2);
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = dr.switchTo().alert();
            alert.accept();
        } catch (Exception e) {

        }
    }





    public  static  void Paymen_for_Dev () {

        SendKeys("//td/input  [@ id ='first_name']","Ageev Nikita" );
        SendKeys("//td/input  [@ id ='card_number']","4111111111111111");
        SendKeys("//td/input  [@ id ='card_security']", "123");
        SendKeys("//td/input  [@ id ='card_address1']","Biling Address 123");
        SendKeys("//td/input  [@ id ='card_city']","Doneck" );
        SendKeys("//td/input  [@ id ='card_zip']","456789");
        ClickButton_xpath("//td/select   [@ id ='card_countries']/option [@value= 'US' ]");
        ClickButton_xpath("//td/button [@id = 'payment_button_new']");

        if (dr.getCurrentUrl().contains("payment.htm")) {

            System.out.println("Payment not successful");
        }
        if (dr.getCurrentUrl().contains("en/payment/success/cc/")){
            System.out.println("Payment successful");
        }

    }


    public  static void  If_Click_Button (String xpath, String xpath1){
        if (CheckButton(xpath)){
        ClickButton_xpath(xpath1);}

        }


    }


