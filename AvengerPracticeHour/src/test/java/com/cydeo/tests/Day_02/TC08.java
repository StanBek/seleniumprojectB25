package com.cydeo.tests.Day_02;

import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC08 {
    public static void main(String[] args) throws InterruptedException {
        //1-open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2-goto https://app.seamlessly.net/index.php/login
        driver.get("https://app.seamlessly.net/index.php/login");
        //3-enter password "UserUser123"
        WebElement passwordWebElement=driver.findElement(By.cssSelector("#password"));
        passwordWebElement.sendKeys("UserUser123");

        String type= passwordWebElement.getAttribute("type");

        if(type.equals("password")){
            System.out.println("Password is hidden and PASSED!");
        }else{
            System.out.println("Password is not hidden and FAILED");
        }
        //4-verify password as "*****"
        //5-click eye icon
        Thread.sleep(3000);

        driver.findElement(By.className("toggle-password")).click();
        //6-verify that password is shown
        type=passwordWebElement.getAttribute("type");
        if(type.equals("text")){
            System.out.println("Password is shown and PASSED!");
        }else{
            System.out.println("Password is not shown and FAILED");
        }

    }
}
