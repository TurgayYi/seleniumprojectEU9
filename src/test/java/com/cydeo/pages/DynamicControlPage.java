package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlPage {

    public DynamicControlPage (){

        PageFactory.initElements(Driver.getDriver(), this);

    }


}
