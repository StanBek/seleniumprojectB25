package com.cydeo.tests.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    public static void main(String[] args) {

        //TC #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        WebElement header = driver.findElement(By.tagName("h3"));
        String actualHeader= header.getText();
        String expectedHEader = "Log in to ZeroBank";
        if(actualHeader.equals(expectedHEader)){
            System.out.println("Verify PASSED!");
        }else{
            System.out.println("Verify FAILED");
        }
        //System.out.println("actualHeader = " + actualHeader);
        //Expected: “Log in to ZeroBank”

        driver.close();

    }
}
