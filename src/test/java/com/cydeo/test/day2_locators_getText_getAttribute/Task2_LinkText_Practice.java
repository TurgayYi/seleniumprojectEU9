package com.cydeo.test.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_LinkText_Practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Go to http://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");

        //click to A/B Testing from top of the list
       //driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        //verify title

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        driver.navigate().back();

        String expectedTitle2 = "Practice";
        String actualTitle2 = driver.getTitle();

        if(expectedTitle2.equals(actualTitle2)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }










    }
}
