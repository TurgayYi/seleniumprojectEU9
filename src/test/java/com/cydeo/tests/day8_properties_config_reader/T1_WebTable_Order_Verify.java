package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    public WebDriver driver;

    @BeforeMethod

    public void setUpMethod(){
        //TC #1: Web table practice
        //1. Go to: https://practice.cydeo.com/web-tables

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");


    }


    @Test
    public void order_name_verify_test(){




        //2. Verify Bob’s name is listed as expected.
        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody//tr[7]//td[.='Bob Martin']"));

        //Expected: “Bob Martin”

        String expectedBobName= "Bob Martin";
        String actualBobName = bobMartinCell.getText();

        Assert.assertEquals(actualBobName,expectedBobName);



        //3. Verify Bob Martin’s order date is as expected
        WebElement bobOrderDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody//tr[7]//td[.='Bob Martin']/following-sibling::td[3]"));
        String actualBobOrderDate = bobOrderDate.getText();
        String expectedBodOrderDate = "12/31/2021";

        //Expected: 12/31/2021

        Assert.assertTrue(actualBobOrderDate.equals(expectedBodOrderDate));



    }



}
