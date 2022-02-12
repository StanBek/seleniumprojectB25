package com.cydeo.tests.Day_02;

import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC03 {

    public static void main(String[] args) {

        //1-open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");

        //3-verify Contact is displayed and label is "Contact"

        WebElement contactWebElement=driver.findElement(By.xpath("//ul[@id='top-menu']//*[contains(@href,'contact')]"));

        if(contactWebElement.isDisplayed()){
            System.out.println("PASSED!!!");
        }else {
            System.out.println("FAILED!!!");
        }

        driver.close();
    }
}
