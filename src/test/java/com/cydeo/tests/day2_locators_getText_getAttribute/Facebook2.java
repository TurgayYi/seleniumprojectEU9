package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        WebElement elementEmail = driver.findElement(By.name("email"));

        elementEmail.sendKeys("ali@email.com");

        WebElement elementPassword = driver.findElement(By.name("pass"));
        elementPassword.sendKeys("2345" );

        WebElement elementLogin = driver.findElement(By.name("login"));
        elementLogin.click();

        String actualTitle = driver.getTitle();

        String expectedTitle = "Login to Facebook";











    }


}
/*
TC #2: Facebook incorrect login title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Enter incorrect username
4. Enter incorrect password
5. Verify title changed to:
Expected: “Log into Facebook
 */