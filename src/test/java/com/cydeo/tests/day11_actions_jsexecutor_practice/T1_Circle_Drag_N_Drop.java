package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.DriverPropertyInfo;

public class T1_Circle_Drag_N_Drop {

    @Test

    public void drag_n_drop_test(){

        //TC #: Drag and drop
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index ");

        //locate acceptCookiesBtn and click
        WebElement acceptCookiesBtn = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesBtn.click();



       //Locate small and big circles to be able to drag them around
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement targetCircle = Driver.getDriver().findElement(By.id("droptarget"));

        //2. Drag and drop the small circle to bigger circle.
        Actions actions = new Actions(Driver.getDriver());

        //actions.dragAndDrop(smallCircle,targetCircle).perform();

        actions.clickAndHold(smallCircle).pause(2000)
                .moveToElement(targetCircle)
                .pause(2000)
                .release()
                .perform();


        //3. Assert:
        String actualTargetCircleText = targetCircle.getText();
        String expectedTargetCircleText = "You did great!";

        Assert.assertEquals(actualTargetCircleText, expectedTargetCircleText);

        //-Text in big circle changed to: “You did great!”






    }




}
