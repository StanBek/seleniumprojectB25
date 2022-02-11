package com.cydeo.tests.Day_4_findElement_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_FindElements {

    public static void main(String[] args) {

        //TC #4: FindElements Task
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/abtest
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/abtest");
        //3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());
        //5- Print out the texts of the links.
        //6- Print out the HREF attribute values of the links

        for (WebElement list: allLinks) {
            System.out.println("list.getText() = " + list.getText());
            System.out.println("list.getAttribute(\"href\") = " + list.getAttribute("href"));
        }


    }
}
