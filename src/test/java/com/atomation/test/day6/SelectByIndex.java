package com.atomation.test.day6;

import com.atomation.utilities.BrowserUtils;
import com.atomation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {


    public static void main(String[] args) {

        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        Select stateSelect = new Select(driver.findElement(By.id("state")));
       stateSelect.selectByIndex(33);


        BrowserUtils.wait(3);
        driver.quit();


    }
}
