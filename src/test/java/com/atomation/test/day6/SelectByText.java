package com.atomation.test.day6;

import com.atomation.utilities.BrowserUtils;
import com.atomation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectByText {

    public static void main(String[] args) {

        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(2);
        //create webelement object for drop-down
        WebElement simpleDropdown = driver.findElement(By.id("dropdown"));
        //provide webelement object into constructor
        Select selectSimpleDropdown = new Select(simpleDropdown);
        //select by visible text
        selectSimpleDropdown.selectByVisibleText("Option 2");
        BrowserUtils.wait(2);
        selectSimpleDropdown.selectByVisibleText("Option 1");
        BrowserUtils.wait(2);

        Select selectYear = new Select(driver.findElement(By.id("year")));
        Select selectMonth = new Select(driver.findElement(By.id("month")));
        Select selectDay = new Select(driver.findElement(By.id("day")));

        selectYear.selectByVisibleText("2003");
        selectMonth.selectByVisibleText("February");
        selectDay.selectByVisibleText("25");

        //select ALL months one by one
        List<WebElement> monnths = selectMonth.getOptions();
        for(WebElement month: monnths){
            selectMonth.selectByVisibleText(month.getText());
            BrowserUtils.wait(1);
        }
        selectYear.selectByVisibleText("1986");
        selectMonth.selectByVisibleText("April");
        selectDay.selectByVisibleText("18");

        BrowserUtils.wait(3);
        Select stateSelect = new Select(driver.findElement(By.id("state")));
        stateSelect.selectByVisibleText("New York");

        //We can VERIFY if SELECTED Option is CORRECT
        //Option that is currently selected
        String selected = stateSelect.getFirstSelectedOption().getText();
        //then check with if statement
        if(selected.equals("New York") ){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        List<WebElement> states = stateSelect.getOptions();
        for(WebElement stateOption : states){
            System.out.println(stateOption.getText());
        }

        BrowserUtils.wait(3);
        driver.quit();
    }
}
