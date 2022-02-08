package com.cydeo.tests.Day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {

    public static void main(String[] args) throws InterruptedException {


            //TC #1: NextBaseCRM, locators and getText() practice
            //1- Open a Chrome browser
            //2- Go to: https://login1.nextbasecrm.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");
            //3- Enter incorrect username: “incorrect”
        WebElement inputUsername =driver.findElement(By.name("USER_LOGIN"));
        inputUsername.sendKeys("incorrect");

            //4- Enter incorrect password: “incorrect”

        WebElement inputPassword=driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

            //5- Click to log in button.

        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.submit();
            //6- Verify error message text is as expected:
            //Expected: Incorrect login or password

        WebElement header = driver.findElement(By.className("errortext"));
        String expected = "Incorrect login or password";
        String actual = header.getText();
        if(actual.contains(expected)){
            System.out.println("PASSED!!!");
        }else{
            System.out.println("FAILED!!!");
        }

        Thread.sleep(2000);

        driver.close();
    }
}
