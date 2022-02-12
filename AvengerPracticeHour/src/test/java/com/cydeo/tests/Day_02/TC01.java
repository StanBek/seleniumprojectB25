package com.cydeo.tests.Day_02;

import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC01 {

    public static void main(String[] args) {

        //TC:1 As a user I should be able to see Home is displayed
        //1-open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");

        //3-verify Home is displayed

        WebElement  verifyHome = driver.findElement(By.xpath("//*[@id=\"menu-item-844\"]/a"));
    }
}
