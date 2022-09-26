package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlPage;
import com.cydeo.utilities.BrowserUtil;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitPractices {


    DynamicControlPage dynamicControlPage;
    @BeforeMethod

    public void setUpMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");

        dynamicControlPage = new DynamicControlPage();


    }

    @Test
    public void remove_button_test(){

        //TC #2: Explicit wait practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");

        //3- Click to “Remove” button
        //DynamicControlPage dynamicControlPage = new DynamicControlPage();
        dynamicControlPage.removeButton.click();


        //4- Wait until “loading bar disappears”
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        //wait.until(ExpectedConditions.invisibilityOf(dynamicControlPage.loadingBar));

        BrowserUtil.waitForInvisibilityOy(dynamicControlPage.loadingBar);


        //5- Verify:
        //a. Checkbox is not displayed
        try{
            Assert.assertTrue(!dynamicControlPage.checkbox.isDisplayed());
            Assert.assertFalse(dynamicControlPage.checkbox.isDisplayed());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }


        //b. “It’s gone!” message is displayed.

        Assert.assertTrue(dynamicControlPage.message.isDisplayed());
        System.out.println("dynamicControlPage.message.getText() = " + dynamicControlPage.message.getText());


    }


    @Test

    public void enable_button_test(){

        //TC #3: Explicit wait practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        //3- Click to “Enable” button

        //4- Wait until “loading bar disappears”
        //5- Verify:
        //a. Input box is enabled.
        //b. “It’s enabled!” message is displayed






    }






}
