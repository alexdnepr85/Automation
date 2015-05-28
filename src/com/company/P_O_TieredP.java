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
        dr.get("https://pdffiller.com/en/login.htm");}

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

    public static boolean WaitButton (String xpath){ //   для ожидания элемента на странице по xpath

        try{
            new WebDriverWait(dr,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        }catch (TimeoutException e){
            System.out.println("Element still not visible after 10 seconds!");
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

    public  static  String   PrintPaymentText () {
        String  k =  dr.findElement(By.xpath("//li [@id ='professional']//div [@class='list-plan-item__button " +
                "list-plan-item__button_bottom annual active']//a[text()]")).getText();
        System.out.println("Кнопка на Payment : " + k );
        return k;   // обернуть в try catch , при ошибке искать другой Xpath

    }

    public  static void DeleteAccoutn (){
        dr.findElement(By.xpath(".//a [text()='My Account']")).click();
        dr.findElement(By.xpath(".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]")).click();
        dr.findElement(By.xpath(".//div [@class='p1'] /a")).click();
        checkAlert();

    }

    public static  void checkAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(dr, 2);
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = dr.switchTo().alert();
            alert.accept();
        } catch (Exception e) {

        }







    }}
