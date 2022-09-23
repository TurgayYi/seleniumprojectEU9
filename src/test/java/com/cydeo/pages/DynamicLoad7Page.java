package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad7Page {

    //Create constructor and instantiate driver and object of the class
    public DynamicLoad7Page(){

        PageFactory.initElements(Driver.getDriver(),   this);

    }

    @FindBy(xpath = "//div[@id='alert']//strong")
    public WebElement doneMessage;









}
