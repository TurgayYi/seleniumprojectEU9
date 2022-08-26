package com.cydeo.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        // set up the "browser driver"
        WebDriverManager.chromedriver().setup();
        //create instance of the Selenium Webdriver
        WebDriver driver = new ChromeDriver();

        //this line maximize the browser size
        driver.manage().window().maximize();

        //the same as maximize
        //driver.manage().window().fullscreen();

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

        // this will close the currently opened window
        driver.close();

        //if more than one window was opened, everything will be closed
        driver.quit();

    }




}
