package com.cydeo.tests.shortVideoPractise;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test1 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://app.vytrack.com/user/login");

        WebElement username =  driver.findElement(By.xpath("//input[@class='span2']"));

        username.sendKeys("abcd" );

        WebElement password = driver.findElement(By.xpath("//input[@name='_password']"));
        password.sendKeys("abcd");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();


        //WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[1]/div"));
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='alert alert-error']"));
        String actualErrorMessage = errorMessage.getText();

        String expectedErrorMessage = "Invalid user name or password.";

        if(actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification PASSED");
        }else{
            System.out.println("Error message verification FAILED");
        }

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        if(currentURL.contains("vytrack")){
            System.out.println("URL verification PASSED");
        }else{
            System.out.println("URL verification FAILED");
        }


        WebElement forgotPassword = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]/a"));
        forgotPassword.click();

        String actualForgotPasswordTitle = driver.getTitle();
        String expectedForgotPasswordTitle ="Forgot Password";

        if(actualForgotPasswordTitle.equals(expectedForgotPasswordTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }


    }









    }

