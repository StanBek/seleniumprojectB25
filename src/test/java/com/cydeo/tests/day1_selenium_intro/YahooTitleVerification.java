package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTitleVerification {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        String currentTitle=driver.getTitle();
        System.out.println("currentTitle= "+currentTitle);

        String currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl= "+currentUrl);

        Thread.sleep(3000);

        driver.close();




    }
}
