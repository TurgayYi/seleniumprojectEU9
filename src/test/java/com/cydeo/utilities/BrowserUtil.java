package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/*
In this class only general utility methods that are not related to some specific page
 */
public class BrowserUtil {


    public static void sleep(int second){
        second+=1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInURL, String expectedTitle){

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) {

            driver.switchTo().window(each);
            System.out.println("Current URL " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains(expectedInURL)){
                break;
            }
        }

        //5. Assert: Title contains “Etsy”

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }


    //crating a utility method for ExplicitWait, so we don't have to repeat the lines
    public static void waitForInvisibilityOy(WebElement webElement){

        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));

    }


}
