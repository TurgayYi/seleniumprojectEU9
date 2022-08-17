package com.cydeo.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        // setting up the web driver manager
        //we create our "Browser Driver"
        WebDriverManager.chromedriver().setup();

        //create instance of the chrome driver

        WebDriver driver = new ChromeDriver();

        //Test if driver is working
        driver.get("https://google.com");



    }


}
