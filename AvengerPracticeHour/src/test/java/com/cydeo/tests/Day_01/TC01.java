package com.cydeo.tests.Day_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev");

        String expectedURL="https://www.selenium.dev/";

        String actualURL=driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("Verification PASSED!!!");
        }else{
            System.out.println("Verification FAILED!!!");
        }

        driver.close();
    }
}
