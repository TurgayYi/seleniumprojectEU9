package com.cydeo.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        //do set up for browser driver
        WebDriverManager.chromedriver().setup();

        //open Chrome browser
        WebDriver driver = new ChromeDriver();

        //make our page fullscreen
        driver.manage().window().maximize();

        // go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");


        //verify title
        //Expected :Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";


        // actual title comes from the browser
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test is as expected.Verification PASSED");
        }else{
            System.out.println("Title is NOT as expected. Verification FAİLED");
        }



    }

}
