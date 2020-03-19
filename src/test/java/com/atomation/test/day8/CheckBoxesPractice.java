package com.atomation.test.day8;

import com.atomation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxesPractice {

    private WebDriver driver;

    /**
     * TASK for 5 minutes
     * Given user is on the practice landing page
     * When user navigates to "Checkboxes" page
     * And clicks on checkbox #1
     * Then user verifies that checkbox #1 is selected
     */

    @Test
    public void checkboxTest1() {


            driver.findElement(By.linkText("Checkboxes")).click();

            //collect all checkboxes
            List<WebElement> checkboxes = driver.findElements(By.tagName("input"));
            BrowserUtils.wait(4);

            checkboxes.get(0).click();//to click on 1st checkbox

            Assert.assertTrue(checkboxes.get(0).isSelected(), "Checkbox #1 is not selected!");



    }


    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79").setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();



    }
    @AfterMethod
    public void  tearDown(){
        driver.quit();
    }

}
