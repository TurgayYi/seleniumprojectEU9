package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3_BackAndForth {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.manage().window().fullscreen();

        WebElement gmail = driver.findElement(By.className("gb_d"));
        gmail.click();

        String actualTitle = driver.getTitle();

        if(actualTitle.contains("Gmail")){
            System.out.println("Gmail title verification PASSED");
        }else{
            System.out.println("Gmail title verification FAILED");
        }

        driver.navigate().back();

        String actualGoogleTitle = driver.getTitle();
        String expectedGoogleTitle = "Google";

        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google title verification PASSED");
        }else{
            System.out.println("Google title verification PASSED");
        }

        driver.close();






    }



}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */