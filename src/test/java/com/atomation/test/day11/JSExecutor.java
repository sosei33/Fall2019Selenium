package com.atomation.test.day11;

import com.atomation.utilities.BrowserUtils;
import com.atomation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.sql.rowset.BaseRowSet;

public class JSExecutor {

   private RemoteWebDriver driver;
    //private WebDriver driver;
    //Create Action Class over here
    //private Actions actions;




    @BeforeMethod
    public void setup() {
       // driver = DriverFactory.createDriver("chrome");
        WebDriverManager.chromedriver().version("79").setup();
        //actions = new Actions(driver);
        driver = new ChromeDriver();
    }
    @Test
    public void scrollTest(){
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        driver.manage().window().maximize();
        //We have to create an object of JS
        //by casting JavascriptExecutor into JavascriptExecutor object
        //Note: We need to cast when we use webdriver but NO need to cast when we use REMOTEWEBDRIVER
       // JavascriptExecutor js = (JavascriptExecutor) driver;

        //driver.executeScript("window.scrollBy(0, 250)");
        //We can put it inti the loop

        for (int i = 0; i < 10; i++) {
            driver.executeScript("window.scrollBy(0, 250)");
            BrowserUtils.wait(1);
        }

        //To scroll to a specific place ---> like until something become visible


    }
    @Test
    public void scrollToElementTest(){
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
        BrowserUtils.wait(2);
        WebElement link = driver.findElement(By.linkText("Cybertek School"));
        //scrollIntoView - javascript method
        //arguments[0] - means 1st webelement after comma
        driver.executeScript("arguments[0].scrollIntoView(true)", link);
    }








    /*
    @Test
    public void scrollToElementTest(){
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
        BrowserUtils.wait(2);
        WebElement link = driver.findElement(By.linkText("Cybertek School"));
        driver.executeScript("argument[0].scrollIntoView(true)", link);

    }

     */



    @AfterMethod
    public void teardown() {
        BrowserUtils.wait(2);
        driver.quit();
    }
}