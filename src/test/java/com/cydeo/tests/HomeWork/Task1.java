package com.cydeo.tests.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        //2. Go to https://www.etsy.com

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");
        WebElement search= driver.findElement(By.id("global-enhancements-search-query"));
        search.sendKeys("wooden spoon"+ Keys.ENTER);


        //3. Search for “wooden spoon”
        //4. Verify title:
        String expectedTitle="Wooden spoon | Etsy";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification PASSED!!!");
        }else{
            System.out.println("Verification FAILED");
        }
        //Expected: “Wooden spoon | Etsy”

        Thread.sleep(2000);

        driver.close();
    }
}
