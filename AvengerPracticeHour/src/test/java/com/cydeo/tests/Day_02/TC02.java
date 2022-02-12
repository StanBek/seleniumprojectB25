package com.cydeo.tests.Day_02;

import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC02 {

    public static void main(String[] args) {
        //1-open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");

        //3-verify About us is displayed
        WebElement verifyAboutUs = driver.findElement(By.xpath("//ul[@id='top-menu']/li[@id='menu-item-854']/a"));
        String actualVerifyAboutUs=verifyAboutUs.getText();
        System.out.println("actualVerifyAboutUs = " + actualVerifyAboutUs);
        System.out.println("verifyAboutUs.isDisplayed() = " + verifyAboutUs.isDisplayed());
        driver.close();




    }
}
