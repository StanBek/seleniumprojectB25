package com.cydeo.tests.Day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {


        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        //2- Go to: https://login1.nextbasecrm.com/
        // 3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        String expectedRememberMeLabel="Remember me on this computer";
        String actualRememberMeLabel=rememberMeLabel.getText();
        if(actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification PASSED!!!");
        }else{
            System.out.println("Label verification FAILED");
        }

        //4- Verify “forgot password” link text is as expected:
        // Expected: Forgot your password?
        WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPassword="forgot password?";
        String actualForgotPassword=forgotPassword.getText();
        if(actualForgotPassword.equals(expectedForgotPassword)){
            System.out.println("Verify PASSED!!!");
        }else{
            System.out.println("Verify FAILED");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        WebElement VerifyForgotPassword = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedInHref="forgot_password=yes";
        String actuaInHref = VerifyForgotPassword.getAttribute("href");
        if(actuaInHref.contains(expectedInHref)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
    }
}
