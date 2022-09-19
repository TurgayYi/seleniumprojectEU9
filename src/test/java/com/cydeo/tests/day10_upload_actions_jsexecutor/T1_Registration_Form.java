package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_Form {


    @Test

    public void registration_form_test(){

        //. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form

        //Driver.getDriver()---> driver.get(url)

        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        Faker faker = new Faker();


        //3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //inputUserName.sendKeys(faker.name().username());
        String user = faker.bothify("helpdesk####");
        inputUserName.sendKeys(user);

        //6. Enter email address

        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user + "@email.com");


        //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.bothify("####????"));

        //8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhoneNumber.sendKeys(faker.numerify("###-###-####"));


        //9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        //10.Enter date of birth
        WebElement inputDateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        inputDateOfBirth.sendKeys("03/08/2000");

        //11.Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));


        //12.Select Job Title
        WebElement jobTitle = Driver.getDriver().findElement(By.xpath("//select[@name='job_title']"));
        Select jobTitleDropdown = new Select(jobTitle);
        jobTitleDropdown.selectByIndex(faker.number().numberBetween(1,8));


        //13.Select programming language from checkboxes
        WebElement programmingLanguage = Driver.getDriver().findElement(By.xpath("//label[@for='inlineCheckbox3']"));
        programmingLanguage.click();

        //14.Click to sign up button

        WebElement signUpBtn = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        signUpBtn.click();


        //15.Verify success message “You’ve successfully completed registration.” is
        WebElement actualMessage = Driver.getDriver().findElement(By.tagName("p"));
        String  actualStringMessage= actualMessage.getText();

        String expectedMessage = "You've successfully completed registration!";

        Assert.assertEquals(actualStringMessage,expectedMessage);




        //displayed.
        //Note:
        //1. Use new Driver utility class and method
        //2. User JavaFaker when possible
        //3. User ConfigurationReader when it makes sense









    }

}
