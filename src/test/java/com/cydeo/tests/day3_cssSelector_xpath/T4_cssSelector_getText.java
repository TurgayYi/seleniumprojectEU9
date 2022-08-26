package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {

    public static void main(String[] args) {

        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password


        //WebElement resetPassword = driver.findElement(By.cssSelector("button[class='login-btn']"));

        WebElement resetPassword = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String actualResetPasswordText = resetPassword.getText();
        String expectedResetPasswordText = "Reset password";



        if(actualResetPasswordText.equals(expectedResetPasswordText)){
            System.out.println("Button text verification PASSED");
        }else{
            System.out.println("Button text verification FAILED");

        }


    }

}
