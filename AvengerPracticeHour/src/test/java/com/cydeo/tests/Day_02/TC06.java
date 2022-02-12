package com.cydeo.tests.Day_02;

import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC06 {

    public static void main(String[] args) {
        //1-open a chrome browser

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");
        //3-click Login label
        //csslocator for login #top-menu>li#menu-item-849>a
        //xpathlocator for login //ul[@id='top-menu']/li[6]/a
        driver.findElement(By.xpath("//ul[@id='top-menu']/li[6]/a")).click();
        //4-enter username "User1"
        WebElement username =driver.findElement(By.id("prependedInput"));
        username.sendKeys("User1");

        //5-enter password "UserUser123"
        WebElement password = driver.findElement(By.name("_password"));
        password.sendKeys("UserUser123");

        String type=password.getAttribute("type");
        //6-verify the password is hidden

        if(type.equals("password")){
            System.out.println("PASSED!!!");
        }else{
            System.out.println("FAILED!!!");
        }
    }
}
