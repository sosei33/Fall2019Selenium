package com.atomation.test.day5;

import com.atomation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        BrowserUtils.wait(5);
        //<input type="checkbox" checked="">
        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));

       //checkBoxes.get(0).click(); // click on first checkbox

        BrowserUtils.wait(2);

        //go over collection of checkboxes
        for(int i=0; i<checkBoxes.size(); i++) {
            //       if visible,                            eligible to click  and         not clicked yet
            if (checkBoxes.get(i).isDisplayed() && checkBoxes.get(i).isEnabled() && (!checkBoxes.get(i).isSelected())) {

                //if checkbox is not selected, click on it
                checkBoxes.get(i).click(); // click on the checkbox
                System.out.println(i+1 +" checkbox clicked!");
            } else{

                System.out.println(i+1 +" checkbox wasn't clicked!");
            }

        }
        BrowserUtils.wait(2);
        driver.quit();
    }




/*

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://practice.cybertekschool.com/checkboxes");

        BrowserUtils.wait(2);

        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));

        checkBoxes.get(0).click();
        BrowserUtils.wait(2);

        checkBoxes.get(1).click();
        BrowserUtils.wait(2);
/*
        if ((!checkBoxes.get(0).isSelected() && checkBoxes.get(1).isSelected())) {
            System.out.println("TEST PASSED!");

        } else {
            System.out.println("TEST FAILED");
        }
        BrowserUtils.wait(2);

        driver.quit();

 */
/*
        if ((checkBoxes.get(0).isSelected())){
            System.out.println("CHECKBOX SELECTED");
        }else {
            System.out.println("CHECKBOX NOT SELECTED");
        }
        BrowserUtils.wait(2);


        if(checkBoxes.get(1).isSelected()){
            System.out.println("CHECKBOX SELECTED!");
        }else {
            System.out.println("CHECKBOX NOT SELECTED");
        }

        BrowserUtils.wait(2);


        driver.quit();

 */




    }




