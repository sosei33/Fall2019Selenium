package com.atomation.test.day7;

import com.atomation.utilities.BrowserUtils;
import com.atomation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//public class Xpath {

/*
    public static void main(String[] args) {


        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        BrowserUtils.wait(2);

        driver.findElement(By.xpath("//label[text() = 'Username']/following-sibling::input")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//label[text() = 'Password']/following-sibling::input")).sendKeys("SuperSecretPassword");
        //driver.findElement(By.xpath("//button[text()='Login' ]")).click();
        driver.findElement(By.xpath("//button[@type='submit' and @id='wooden_spoon']"));

        BrowserUtils.wait(2);
        driver.quit();
    }

 */
    public class Xpath {
        public static String userNameLocator = "//label[text()='Username']/following-sibling::input";
        public static String passwordLocator = "//label[text()='Password']/following-sibling::input";
        public static String loginBtnLocator = "//button[contains(text(), 'Login')]";

        public static void main(String[] args) {

            WebDriver driver = DriverFactory.createDriver("chrome");
            driver.get("http://practice.cybertekschool.com/login");
            BrowserUtils.wait(3);
            driver.findElement(By.xpath(userNameLocator)).sendKeys("tomsmith");
            driver.findElement(By.xpath(passwordLocator)).sendKeys("SuperSecretPassword");
            driver.findElement(By.xpath(loginBtnLocator)).click();

            BrowserUtils.wait(3);
            driver.quit();
        }
    }

