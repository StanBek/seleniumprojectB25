package com.cydeo.tests.HomeWork;




import com.cydeo.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //TC 1: As a User I should be able to see ‘Your content goes here.’ And ‘An iFrame containing the TinyMCE WYSIWYG Editor’
        //1- Open a chrome browser
        //2- Go to https://the-internet.herokuapp.com/
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/");
    }

    /*@AfterMethod
    public void tearDown(){
        driver.close();
    }

     */

    @Test
    public void VerifyLabelIn_Iframe(){
        //3- Click iFrame
        //4- Verify the ‘Your content goes here.’ label
        //5- Verify the header ‘An iFrame containing the TinyMCE WYSIWYG Editor’
        WebElement frameButton= driver.findElement(By.xpath("//a[.='Frames']"));
        frameButton.click();
        WebElement iframeButton = driver.findElement(By.xpath("//a[.='iFrame']"));
        iframeButton.click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']")));

        String actualVerifyLabel = driver.findElement(By.xpath("//body[@id='tinymce']/p[1]")).getText();
        String expectedVerifyLabel = "Your content goes here.";

        Assert.assertEquals(actualVerifyLabel,expectedVerifyLabel, "Failed");

        driver.switchTo().parentFrame();

        String actualVerifyHeader = driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']")).getText();
        String expectedVerifyHeader = "An iFrame containing the TinyMCE WYSIWYG Editor";

        Assert.assertEquals(actualVerifyHeader,expectedVerifyHeader);


    }


}
