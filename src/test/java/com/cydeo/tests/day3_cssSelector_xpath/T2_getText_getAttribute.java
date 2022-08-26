package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer

        WebElement rememberMELabel = driver.findElement(By.className("login-item-checkbox-label"));
        String actualRememberMeLAbel = rememberMELabel.getText();
        String expectedRememberMeLabel = "Remember me on this computer";

        if(actualRememberMeLAbel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification PASSED");
        }else{
            System.out.println("Label verification FAILED");
        }

       // 4- Verify “forgot password” link text is as expected:
       // Expected: Forgot your password?

        WebElement forgotPassword  = driver.findElement(By.className("login-link-forgot-pass"));
        String actualForgotPasswordLinkText = forgotPassword.getText();
        String expectedForgotPasswordLinkText = "Forgot your password?";
        if(actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)){
            System.out.println("Forgot password link verification test PASSED");
        }else{
            System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);
            System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
            System.out.println("Forgot password link verification test FAILED");
        }




        //        5- Verify “forgot password” href attribute’s value contains expected:
       // Expected: forgot_password=yes

        String expectedHref = "forgot_password=yes";
        String actualHref = forgotPassword.getAttribute("href");

        System.out.println("actualHref = " + actualHref);

        if(actualHref.contains(expectedHref)){
            System.out.println("href attributes value verification PASSED");
        }else{
            System.out.println("href attributes value verification FAILED");
        }



       // PS: Inspect and decide which locator you should be using to locate web
       /// elements.




    }
}
