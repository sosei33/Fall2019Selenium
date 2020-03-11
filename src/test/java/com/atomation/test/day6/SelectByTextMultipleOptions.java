package com.atomation.test.day6;

import com.atomation.utilities.BrowserUtils;
import com.atomation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectByTextMultipleOptions {
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);

       Select languagesSelect = new Select(driver.findElement(By.name("Languages")));
       boolean isMultiple = languagesSelect.isMultiple();
        System.out.println(isMultiple);

        languagesSelect.selectByVisibleText("Java");
        languagesSelect.selectByVisibleText("JavaScript");
        languagesSelect.selectByVisibleText("Python");
        BrowserUtils.wait(3);
        //SELECTING ALL
        List<WebElement> selectedLanguages= languagesSelect.getAllSelectedOptions();
        for(WebElement selectedLanguage : selectedLanguages){
            System.out.println(selectedLanguage.getText());
        }
        BrowserUtils.wait(3);

       languagesSelect.selectByVisibleText("Java");
        BrowserUtils.wait(3);

        languagesSelect.deselectAll();


        BrowserUtils.wait(3);
        driver.quit();

    }
}
