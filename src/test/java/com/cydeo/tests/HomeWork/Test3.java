package com.cydeo.tests.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

    public static void main(String[] args) throws InterruptedException {


        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://google.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        gmail.click();

        String actualTitle= driver.getTitle();
        String expectedTitle="Gmail";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED");
        }
        System.out.println("========================================");

        Thread.sleep(2000);
        //3- Click to Gmail from top right.
        //4- Verify title contains:
        //Expected: Gmail
        //5- Go back to Google by using the .back();
        driver.navigate().back();

        String actualTitle2= driver.getTitle();
        String expectedTitle2="Google";
        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED");
        }
        //6- Verify title equals:
        //Expected: Google

        driver.close();
    }
}
