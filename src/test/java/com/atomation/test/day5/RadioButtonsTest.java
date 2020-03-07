package com.atomation.test.day5;

import com.atomation.utilities.BrowserUtils;
import com.atomation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RadioButtonsTest {

    public static void main(String[] args) {

        WebDriver driver = DriverFactory.createDriver("chrome");

        driver.navigate().to("http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();

        BrowserUtils.wait(2);

        WebElement blackButton = driver.findElement(By.id("black"));

        blackButton.click();

        if (blackButton.isSelected()) {
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        driver.quit();
    }
}