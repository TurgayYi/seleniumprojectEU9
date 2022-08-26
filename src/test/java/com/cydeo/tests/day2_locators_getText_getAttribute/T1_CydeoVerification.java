package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com");

        String actualURL = driver.getCurrentUrl();
        if(actualURL.contains("cybertekschool")){
            System.out.println("URL verification PASSED");
        }else{
            System.out.println("URL verification FAILED");
        }

        String actualTitle = driver.getTitle();
        if (actualTitle.equals("Practice")){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }






    }
}
