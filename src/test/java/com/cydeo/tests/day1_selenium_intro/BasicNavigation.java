package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) {

        //1-Setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2-Create instance of the Selenium WebDriver
        //this is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tesla.com");
    }
}
