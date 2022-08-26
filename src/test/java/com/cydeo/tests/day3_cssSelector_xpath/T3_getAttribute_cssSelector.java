package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
       // 1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

       // 2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:

        //WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        //WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));

        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedLoginButtonText = "Log In";


        String actualLoginButtonText = loginButton.getAttribute("value");

        if(actualLoginButtonText.equals(expectedLoginButtonText)){
            System.out.println("Login text verification PASSED");
        }else{
            System.out.println("Login text verification FAILED");
        }



        //Expected: Log In



    }



}
