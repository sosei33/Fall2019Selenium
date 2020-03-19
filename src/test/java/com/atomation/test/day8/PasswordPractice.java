package com.atomation.test.day8;

import com.atomation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PasswordPractice {
    /*
    /**
 * TASK for 5 minutes
 * Given user is on the practice landing page
 * When user navigates to "Forgot password" page
 * Then user enters his email
 * And clicks "Retrieve password" button
 * Then user verifies that message "Your e-mail's been sent!" is displayed
 */


    private WebDriver driver;

    /*
        @Test
        public void forgotPasswordTest(){

            driver.findElement(By.linkText("Forgot password")).click();
            BrowserUtils.wait(2);
            driver.findElement(By.name("email")).sendKeys();

        }

        @BeforeMethod
        public void setup(){
            WebDriverManager.chromedriver().version("79").setup();
            driver = new ChromeDriver();

        }
        @AfterMethod
        public void  tearDown(){
            driver.quit();
        }

    }

     */
    @Test
    public void forgotPasswordTest() {
        driver.findElement(By.linkText("Forgot Password")).click();
        BrowserUtils.wait(5);

        driver.findElement(By.name("email")).sendKeys("testemail@email.com", Keys.ENTER);
        BrowserUtils.wait(3);

        String actual = driver.findElement(By.name("confirmation_message")).getText();
        String expected = "Your e-mail's been sent!";

        Assert.assertEquals(actual, expected, "Confirmation message is not valid!");
    }


    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().version("79").setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}