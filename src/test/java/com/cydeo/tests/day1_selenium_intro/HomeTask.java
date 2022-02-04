package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTask {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com");

        String actualURL= driver.getCurrentUrl();
        if(actualURL.contains("cydeo")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        System.out.println(actualURL);

        System.out.println("===================================");

        String actualTitle = driver.getTitle();

        if(actualTitle.contains("Practice")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        System.out.println(actualTitle);

        Thread.sleep(2000);

        driver.close();


    }
}
