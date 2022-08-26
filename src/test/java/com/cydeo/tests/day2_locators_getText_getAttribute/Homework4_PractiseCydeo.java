package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework4_PractiseCydeo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/inputs");

        WebElement home = driver.findElement(By.className("nav-link"));

        home.click();

        String actualHomeTitle = driver.getTitle();
        String expectedHomeTitle = "Practice";

        if(actualHomeTitle.equals(expectedHomeTitle)){
            System.out.println("Home title verification PASSED");
        }else{
            System.out.println("Home title verification FAILED");
        }

        driver.close();




    }
}


/*

TC #4: Practice Cydeo – Class locator practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice
PS: Locate “Home” link using “className” locator

 */