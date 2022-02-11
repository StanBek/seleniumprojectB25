package com.cydeo.tests.HomeWork.Day4HomeWork;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {

    public static void main(String[] args) {


        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/forgot_password

        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.get("https://practice.cydeo.com/forgot_password");
        driver.manage().window().maximize();
        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link
        WebElement homeLink = driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        WebElement forgotPassword = driver.findElement(By.cssSelector("div.example>h2"));
        //WebElement forgotPassword1 = driver.findElement(By.xpath("//h2[text()='Forgot Password']");


        WebElement email = driver.findElement(By.xpath("//label[@for='email']"));



        //d. E-mail input box
        WebElement inputBox = driver.findElement(By.xpath("//input[@name='email']"));
       // WebElement inputBox2 = driver.findElement(By.xpath())


        //e. “Retrieve password” button

        WebElement RetrievePassword = driver.findElement(By.cssSelector("#form_submit > i"));
       // WebElement RetrievePassword1=driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement poweredByCydeo = driver.findElement(By.cssSelector("#page-footer > div > div"));
        //WebElement poweredByCydeo1= driver.findElement(By.xpath("//div[@style='text-align:center;']"));


        //4. Verify all web elements are displayed.
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        System.out.println("homeLink = " + homeLink.isDisplayed());
        System.out.println("forgotPassword = " + forgotPassword.isDisplayed());
        System.out.println("email = " + email.isDisplayed());
        System.out.println("inputBox = " + inputBox.isDisplayed());
        System.out.println("RetrievePassword = " + RetrievePassword.isDisplayed());
        System.out.println("poweredByCydeo = " + poweredByCydeo.isDisplayed());


        //Then solve the task using XPATH only. Try to create 2 different XPATH locator if possible
    }
}
