package com.atomation.test.warmup;

import com.atomation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.Arrays;

public class March_4 {
    static WebDriver driver;

    public static void main(String[] args) throws Exception {
        ebayTest();
        amazonTest();
        wikiTest();
    }

    /**
     * Go to ebay --->          driver.get("http://ebay.com");
     * enter search term        input.sendKeys("java book");
     * click on search button   searchButton.click();
     * print number of results
     */
    public static void ebayTest() {
        driver = DriverFactory.createDriver("chrome");
        //WebDriver driver = DriverFactory.createDriver("chrome");
        //* Go to ebay --->
        driver.get("http://ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys("java book");
        driver.findElement(By.id("gh-btn")).click();
        WebElement searchResults = driver.findElement(By.tagName("h1"));

        String[] searchSentence = searchResults.getText().split(" ");

        System.out.println(Arrays.toString(searchSentence));

        System.out.println(searchSentence[0]);
        driver.quit();
    }

    /**
     * go to amazon
     * enter search term
     * click on search button
     * verify title contains search term
     */
    public static void amazonTest() throws Exception {
        driver = DriverFactory.createDriver("chrome");
        // go to amazon
        driver.get("http://amazon.com");
        //enter text and click ENTER
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book", Keys.ENTER);

        Thread.sleep(2000);//to wait 2 seconds

        String title = driver.getTitle();
        if (title.contains("java book")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
        driver.quit();
    }

    /**
     * Go to wikipedia.org
     * enter search term `selenium webdriver`
     * click on search button
     * click on search result `Selenium (software)`
     * verify url ends with `Selenium_(software)`
     */
    public static void wikiTest() throws Exception{
        driver = DriverFactory.createDriver("chrome");
        //* Go to wikipedia.org
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        //* enter search term `selenium webdriver` & click on search button
        driver.findElement(By.id("searchInput")).sendKeys("Selenium (software)", Keys.ENTER);
        //Click on serach result `Selenium (software)`
        driver.findElement(By.partialLinkText("Selenium (software)")).click();

        Thread.sleep(2000);
        //* verify url ends with `Selenium_(software)`
        String link = driver.getCurrentUrl(); // to get link as a String
        if (link.endsWith("Selenium_(software)")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
        driver.quit();

    }

}
