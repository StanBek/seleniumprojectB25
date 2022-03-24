package com.cydeo.tests.day05_03_19_2022_SeleniumOOP;

public class TestSeleniumOOP {

    public static void main(String[] args) {

        MyWebDriver driver = new MyChromeDriver();
        driver.findElement();

        driver = new MyFirefoxDriver();
        driver.findElement();

        ((MyTakeScreenShot)driver).getScreenShot();

        MySearchContext driver2 = new MyChromeDriver();
        driver2.findElement();

    }
}