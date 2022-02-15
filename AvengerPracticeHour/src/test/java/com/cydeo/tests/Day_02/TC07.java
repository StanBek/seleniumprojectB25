package com.cydeo.tests.Day_02;

import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC07 {

    public static void main(String[] args) throws InterruptedException {

        //1-open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");
        //3-click Login label
        WebElement loginButton = driver.findElement(By.xpath("//ul[@id='top-menu']//a[.='LOGIN']"));
        loginButton.click();

        //4-enter username "User1"
        WebElement loginLabel = driver.findElement(By.xpath("//div[@class='input-prepend']//input[@id='prependedInput']"));
        loginLabel.sendKeys("User1");

        //5-enter password "UserUser123"
        WebElement passwordLabel = driver.findElement(By.cssSelector("input[type='password']"));
        passwordLabel.sendKeys("UserUser123");

        Thread.sleep(3000);
        //6-click LOG IN
        WebElement loginPush = driver.findElement(By.cssSelector("button#_submit"));
        loginPush.click();

        //7-verify the user John Doe
        WebElement userName = driver.findElement(By.xpath("//a[@href='javascript: void(0);']"));
        String actualUserName=userName.getText();
        String expectedUserName="John Doe";

        if(actualUserName.equals(expectedUserName)){
            System.out.println("User name verify PASSED!");
        }else{
            System.out.println("User name verify FAILED");
        }

    }
}
