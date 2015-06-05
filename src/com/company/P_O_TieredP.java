package com.company;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.NoSuchElementException;

/**
 * Created by Никита on 25/05/15.
 */
public class P_O_TieredP {

    public  static WebDriver dr ;

    public  static  void  open1 (WebDriver dr) {

        P_O_TieredP.dr = dr;
        dr.manage().window().maximize();
        dr.get("https://www.pdffiller.com/en/login.htm");}

    //https://root:letmein@dev28.pdffiller.com/en/login.htm

    public  static  void  close () {
        dr.close();
    }  // закрыть браузер


    public static  void  SendEmailPass () throws InterruptedException {  // передача мыла и пароля

        int k = 1;
        String email = "ageevnikitatest+AvtTest" + k + "@gmail.com";
        dr.findElement(By.xpath("//div//td/input[@class = 'placeholders input old_vers2 grad-input']")).sendKeys(email);
        dr.findElement(By.xpath("//div//td/input[@class = 'placeholders old_vers2 input grad-input']")).
                sendKeys("1111");
        dr.findElement(By.id("register_btn_site")).click();
    }

    public static String g() {

        String k = dr.findElement(By.xpath("//div [@class = 'login-offset2']/a ")).getText();
        return k;                                          // Generate
    }

    public static void ClickRegister () { // нажатие Register
        dr.findElement(By.xpath("//div//a[@class= 'btn-gray btns1']")).click();
    }


    public static boolean ErrorEMailProv (){  // отображение элемента на стр (Forgot your password)

        try {
            WebElement k = dr.findElement(By.xpath("//div [@class = 'login-offset2']/a"));
            return k.isDisplayed();}
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;}
    }


    public static boolean CheckPaymentButton (String xpath){  // Поиск эл-та на стр Payment

        try {
            dr.findElement(By.xpath(xpath));
            return  true;
            }

        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;}
    }

            //!dr.getCurrentUrl().contains("forms.htm")    взять ссылку сравнить с частью


    public  static void  ErrorEmail() throws InterruptedException { // подбор имейла , если не подошел . цикл

        int  k= 2;
        while (ErrorEMailProv()) {
            String email = "ageevnikitatest+AvtTest" + k + "@gmail.com";
            dr.findElement(By.xpath("//div[@class= 'log_reg']")).click();
            dr.findElement(By.xpath("//div//td/input[@class = 'placeholders input old_vers2 grad-input']")).
                    sendKeys(email);
            dr.findElement(By.xpath("//div//td/input[@class = 'placeholders old_vers2 input grad-input']")).
                    sendKeys("1111");
            dr.findElement(By.id("register_btn_site")).click();
            k = k+1;
            Thread.sleep(2000);}

    }

    public static boolean WaitButton (String xpath,String p){ //   для ожидания элемента на странице по xpath

        try{
            new WebDriverWait(dr,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        }catch (TimeoutException e){
            System.out.println("No such element: "+ p );
            return false;
        }
        return true;

    }

    public  static void  ClickServices () {
        dr.findElement(By.xpath("//div /a[@class = 'h-nav__link '] [@href='/en/services.htm']")).click();
    }

    public  static  String   CheckServices () {
       String  k =  dr.findElement(By.xpath("//div /span[@class = 'text text-to-hide']")).getText();
        return k;

    }

    public  static  void  ClickSubscribeOnServices(){
        dr.findElement(By.xpath("/html[@class=' googleChrome']" +
                "/body/div[@id='body-content-wrapper']/div[@class='wrap-inner']/div[@id='tiered-header']" +
                "/div[@id='tiered-top']/div[@id='block-plan-center']/div[7]/" +
                "a[@class='laundry-table-item__button button-h redirect-button']")).click();

    }

    public static String url1 = "//li [@id ='professional']//div [@class='list-plan-item__button list-plan-item__button_bottom annual active']//a[text()]";
    public static  String url2 = "//div //li  [@id= 'personal']//a [text()= 'Select Plan!'] ";
    public static  String url3 = "//li [@id ='professional']//div [@class='list-plan-item__button list-plan-item__button_bottom annual active']//a[text()]";


    public  static void GetButtonText() {

        if (CheckPaymentButton(url1)){
            String k1 = dr.findElement(By.xpath(url1)).getText();
                System.out.println("Name button on payment page 1 : " + k1);}

            else if (CheckPaymentButton(url2)
                ) { String k1 = dr.findElement(By.xpath(url2)).getText();
                System.out.println("Name button on payment page 2 : " + k1);
            }
        else if (CheckPaymentButton(url3)
                ) { String k1 = dr.findElement(By.xpath(url3)).getText();
            System.out.println("Name button on payment page 3 : " + k1);
        }


    }


    public static void   DeleteAccoutn () throws InterruptedException {
        if (!dr.getCurrentUrl().contains("#payment_cc")){
        dr.findElement(By.xpath(".//a [text()='My Account']")).click();
        dr.findElement(By.xpath(".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]")).click();}

        if  (CheckPaymentButton("//a [@href='/en/account/?op=payment_options']")){
            dr.findElement(By.xpath("//a [@href='/en/account/?op=payment_options']")).click();
            Thread.sleep(2000);
            dr.findElement(By.xpath("//a [@href='/en/account/?op=cancel_bt']")).click();

      if (CheckPaymentButton("//div [@class = 'new-btn btn--light-gray cancel-button']")){
            dr.findElement(By.xpath("//div [@class = 'new-btn btn--light-gray cancel-button']")).click();
            dr.findElement(By.xpath(".//a [text()='My Account']")).click();
            dr.findElement(By.xpath(".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]")).click();
            System.out.println("Delete by Version 1 ");
            dr.findElement(By.xpath(".//div [@class='p1'] /a")).click();
            checkAlert();
          System.out.println("Account Delete");}



          else if (CheckPaymentButton("//a [@href='/en/payment/subscription_cancel.htm?v=interview']")) {
            dr.findElement(By.xpath("//a [@href='/en/payment/subscription_cancel.htm?v=interview']")).click();
            dr.findElement(By.xpath(".//a [text()='My Account']")).click();
                dr.findElement(By.xpath(".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]")).click();
                System.out.println("Delete by Version 2 ");
            dr.findElement(By.xpath(".//div [@class='p1'] /a")).click();
            checkAlert();
          System.out.println("Account Delete");}}


        else {
        dr.findElement(By.xpath(".//a [text()='My Account']")).click();
        dr.findElement(By.xpath(".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]")).click();
        dr.findElement(By.xpath(".//div [@class='p1'] /a")).click();
        checkAlert();
            System.out.println("Account Delete ");}}



    public static  void checkAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(dr, 2);
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = dr.switchTo().alert();
            alert.accept();
        } catch (Exception e) {

        }
    }


    public static void CheckTextServices (){
        try {
            String k1 = "Save 66% off regular price!";
            Assert.assertEquals(k1, CheckServices());
            System.out.println(k1);
        }
        catch (org.junit.ComparisonFailure e ) {
            System.out.println( "Incorrect text on Services page");
        }
    }


    public  static  void Payment () {

        dr.findElement(By.xpath("//td/input  [@ id ='first_name']")).sendKeys("Ageev Nikita");
        dr.findElement(By.xpath("//td/input  [@ id ='card_number']")).sendKeys("4111111111111111");
        dr.findElement(By.xpath("//td/input  [@ id ='card_security']")).sendKeys("123");
        dr.findElement(By.xpath("//td/input  [@ id ='card_address1']")).sendKeys("Biling Address 123");
        dr.findElement(By.xpath("//td/input  [@ id ='card_city']")).sendKeys("Doneck");
        dr.findElement(By.xpath("//td/input  [@ id ='card_zip']")).sendKeys("456789");
        dr.findElement(By.xpath("//td/select   [@ id ='card_countries']/option [@value= 'US' ]")).click();
        dr.findElement(By.xpath("//td/button [@id = 'payment_button_new']")).click();

        if (dr.getCurrentUrl().contains("#payment_cc")) {

            System.out.println("Payment not successful");
        }

    }

    public  static void  ClickChoiseButton (){
        if (CheckPaymentButton("//div [@id ='payment_button']/a[@class= 'button-h']")){
        dr.findElement(By.xpath("//div [@id ='payment_button']/a[@class= 'button-h']")).click();}

        }
    }


