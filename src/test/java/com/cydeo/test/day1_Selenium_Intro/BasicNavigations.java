package com.cydeo.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        // set up the "browser driver"
        WebDriverManager.chromedriver().setup();
        //create instance of the Selenium Webdriver
        WebDriver driver = new ChromeDriver();

        //Go to tesla.com
        driver.get("https://tesla.com");

         //stop code execution for 3 seconds
        Thread.sleep(3000);

        //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        // use selenium to navigate back
        driver.navigate().back();


        //stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().forward();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        driver.navigate().refresh();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigate().to();
        driver.navigate().to("https://google.com");

        //get the title of the page
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // get the current URL using Selenium
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

    }




}
