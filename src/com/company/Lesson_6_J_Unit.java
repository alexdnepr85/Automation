package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


/**
 * Created by Никита on 08/04/15.
 *
 */

@RunWith(JUnit4.class)

public class Lesson_6_J_Unit {
    List<WebElement> td;

    @After
    public void clean () {
        dr.quit();}

    @   Before
    public  void  pered_testom(){
        System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("http://oxogamestudio.com/passwd.current7.htm");
        td = dr.findElements(By.tagName("td"));

    }


    public  WebDriver dr;



    public  void findMaster(String s) {
        dr.findElement(By.xpath("//input[@type = 'password']")).sendKeys(s);  // master field
    }


    public  void findSite(String s1) {
        dr.findElement(By.xpath("(//tr/td/input)[2]")).sendKeys(s1);   //site
    }

    public void  pressEnter () {
        dr.findElement(By.xpath("(//tr/td/input)[2]")).sendKeys(Keys.ENTER);
    }

    public String  contentMaster() {
        String pole1 = dr.findElement(By.xpath("//input[@type = 'password']")).getAttribute("value"); // master field
        return pole1;
    }

    public String contentSite () {
        String pole2 = dr.findElement(By.xpath("(//tr/td/input)[2]")).getAttribute("value"); //password
        return pole2;
    }


    public  String contentParol () {
        String pass = dr.findElement(By.xpath("(//tr/td/input)[4]")).getAttribute("value");//password
        return pass;
    }

    public  boolean isEnableMaster() {
        boolean k = dr.findElement(By.xpath("//input[@type = 'password']")).isEnabled(); // master field
        return k;

    }

    public  boolean isEnableSite() {
        boolean b = dr.findElement(By.xpath("(//tr/td/input)[4]")).isEnabled();
        return b;

    }
     public  boolean isEnablePass() {
         boolean t = dr.findElement(By.xpath("//input[@type = 'password']")).isEnabled();// master field
         return  t;
     }
    public String poiskGenerate () {
        String k = dr.findElement(By.xpath("//input[@type= 'submit']")).getAttribute("value");
        return k;                                          // Generate
    }

    public String getMasterLabel(){

        String s = td.get(0).getText();
        return s;

    }

    public String getSiteLabel(){

        String s = td.get(2).getText();
        return s;
    }

    public String getPasswordLabel(){

        String s = td.get(5).getText();
        return s;
    }



/*
    @Test

    public  void  Test1(){

        findMaster("123456");
        findSite("gmail.com");
        pressEnter();
        String expectedresult2 = "DhpO4o+PKM3qA@1a";
        Assert.assertEquals("Тест 1 упал " ,expectedresult2,contentParol() );

    }



    @Test

    public  void Test2 (){

        findMaster("");
        findSite("");
        pressEnter();
        String expectedresult2 = "BaefBs8/Z/cm2@1a";
        Assert.assertEquals("Тест 2 упал " ,expectedresult2,contentParol() );
    }

    @Test

    public  void Test3 () {

        int i = 0;
        for (i=0; i<200; i++ ) {
            findMaster("1");
            findSite("1");
        }
        pressEnter();
        String expectedresult2 = "aR8ztwNBbSqe5@1a";
        Assert.assertEquals("Тест 3 упал ", expectedresult2, contentParol());
    }


    @Test
    public  void Test4 (){

        findMaster("!@#$%^&*((((()");
        findSite("!@#$%^&*())))))))");
        pressEnter();
        String expectedresult2 = "fwfy9LM437BKx@1a";
        Assert.assertEquals("Тест 4 упал " , expectedresult2,contentParol());
    }

    @Test
    public  void Test5 (){

        String G = dr.findElements(By.tagName("input")).get(2).getAttribute("value");
        String G1    = "Generate";
        Assert.assertEquals("Тест 5 упал " , G,G1 );
    }


    @Test
    public void  Test6 () {
        String g = "123456";
        String g1 = "gmail.com";
        findMaster(g);
        findSite(g1);
        pressEnter();
        Assert.assertEquals(g,contentMaster());
        Assert.assertEquals(g1,contentSite());
    }

    @Test
    public void  Test7() {
        findMaster("12345");
        findSite("gmail.com");
        pressEnter();
        boolean k = true ;
        Assert.assertEquals(k,isEnableMaster());
    }

    @Test
    public void  Test8() {
        findMaster("12345");
        findSite("gmail.com");
        pressEnter();
        boolean k = true ;
        Assert.assertEquals(k,isEnableSite());
    }

    @Test
    public void  Test9() {
        findMaster("12345");
        findSite("gmail.com");
        pressEnter();
        boolean k = true ;
        Assert.assertEquals(k,isEnablePass());
    }

    @Test
    public  void  Test10() {
        String a = "Your master password";
        String b = "Site name";
        String c = "Generated password";
        Assert.assertEquals(getMasterLabel(),a);
        Assert.assertEquals(getSiteLabel(),b);
        Assert.assertEquals(getPasswordLabel(),c);
    }


    @Test
    public  void  Test11() throws InterruptedException {
        findMaster("11111");
        findSite("11111");
        pressEnter();
        while (contentParol() != "") {
             Thread.sleep(1000);
            return;
         }
        String expectedresult2 = "fbGEc7Ssq/i7a@1a";
        Assert.assertEquals( expectedresult2,contentParol());

    }*/

    @Test
    public  void  Test12 () throws InterruptedException {
        findMaster("22222");
        findSite("22222");
        while (poiskGenerate()!= null ) {
            Thread.sleep (1000);
            return;
        }
        pressEnter();
        String expectedresult2 = "zx62ytG380jLU@1a";
        Assert.assertEquals( expectedresult2,contentParol());
    }

}
