package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class StaleElementRefEx {

    public static void main(String[] args) {

        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

        //3. Click to “Add Element” button
        WebElement addElementBtn = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementBtn.click();

        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteBtn = driver.findElement(By.xpath("//button[@class='added-manually']"));
        System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());


        //5. Click to “Delete” button.
        deleteBtn.click();


        //6. Verify “Delete” button is NOT displayed after clicking.


       try {
           System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());

       }catch (StaleElementReferenceException e){

           System.out.println("StaleElementReferenceException exception is thrown");
           System.out.println("This means the web element is completely is deleted from the page");
           System.out.println("deleteBtn.isDisplayed() = false");
       }

       driver.close();




    }



}
