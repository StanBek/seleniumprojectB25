package com.cydeo.tests.Day_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC04 {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        
        //- Go to "https://app.vytrack.com/user/login"
        forEachVerification("https://app.vytrack.com/user/login");
        
        //- Verify the url contains "vytrack"

        verifyingURL("vytrack");

        verifyingTitle("Login");

        verifyingLabel("Login");


        
        //- Verify the title contains "Login"

        //- Verify the label "Login"

        //login


        //- Verify the message "Invalid user name or password"
        WebElement userNameInput = driver.findElement(By.name("_username"));
        userNameInput.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”
        WebElement userPassword = driver.findElement(By.id("prependedInput2"));
        userPassword.sendKeys("incorrect password");

        WebElement signInButton= driver.findElement(By.id("_submit"));
        signInButton.click();

        Thread.sleep(2000);

        driver.close();
    }

    private static void verifyingTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Verify PASSED!!!");
        }else{
            System.out.println("Verify FAILED");
        }
    }

    private static void verifyingURL(String expectedWord) {

        String actualURL=driver.getCurrentUrl();
        if(actualURL.contains(expectedWord)){
            System.out.println("Verify PASSED!!!");
        }else{
            System.out.println("Verify FAILED!!!");
        }
    }

    private static void forEachVerification(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    private static void verifyingLabel(String expectedLabel){
        WebElement labelElement = driver.findElement(By.tagName("h2"));
        String actualLabelText = labelElement.getText();
        System.out.println(actualLabelText);
        if (expectedLabel.equals(actualLabelText)){
            System.out.println("PASSED!!!");
        }else{
            System.out.println("FAILED");
        }
    }


}
