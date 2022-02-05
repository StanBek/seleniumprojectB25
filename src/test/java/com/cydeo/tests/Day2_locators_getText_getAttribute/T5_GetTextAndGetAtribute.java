package com.cydeo.tests.Day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetTextAndGetAtribute {

    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();
        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Verify PASSED!!!");
        } else {
            System.out.println("Verify FAILED!!!");
        }

        System.out.println("==================================");
        // Expected: Registration form
        // 4- Locate “First name” input box
        WebElement inputBox = driver.findElement(By.name("firstname"));
        String ExpectedInputBox = "first name";
        String actualInputBox = inputBox.getAttribute("placeholder");
        if (actualInputBox.equals(ExpectedInputBox)) {
            System.out.println("Verify PASSED!!!");
        } else {
            System.out.println("Verify FAILED!!!");

            driver.close();
            // 5- Verify placeholder attribute’s value is as expected:
            //Expected: first name
        }
    }
}
