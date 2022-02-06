package com.cydeo.tests.Day_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev");

        String currentTitle=driver.getTitle();
        String currentUrl= driver.getCurrentUrl();

        System.out.println(currentTitle+" + "+currentUrl);

        Thread.sleep(2000);


        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.navigate().to("https://www.etsy.com");

        driver.close();


    }
}
