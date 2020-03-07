package com.atomation.test.day5;

import com.atomation.utilities.BrowserUtils;
import com.atomation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
//TO REMOVE ALL BREAK POINTS
//CLICK SHIFT TWICE
//THEN TYPE BREAK

public class CheckBoxesTest {

    public static void main(String[] args) {


        WebDriver driver = DriverFactory.createDriver("chrome");

        driver.navigate().to("http://practice.cybertekschool.com/checkboxes");
        driver.manage().window().maximize();

        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));

        BrowserUtils.wait(2);

        if ((!checkBoxes.get(0).isSelected() && checkBoxes.get(1).isSelected())) {
            System.out.println("CHECKBOX SELECTED!");

        } else {
            System.out.println("CHECKBOX NOT SELECTED");
        }
        BrowserUtils.wait(2);

        driver.quit();
    }


/*
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        //#TASK
        //verify that 1st checkbox is not selected and 2nd is selected
        BrowserUtils.wait(4);

        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));

        if(!checkBoxes.get(0).isSelected() && checkBoxes.get(1).isSelected()){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }

        BrowserUtils.wait(2);
        //let's click on the first checkbox and verify it's clicked
//        checkBoxes.get(0).click();
        WebElement checkbox1 = checkBoxes.get(0); //to get 1st checkbox
        checkbox1.click();//click on it


        BrowserUtils.wait(2);
        if(checkbox1.isSelected()){
            System.out.println("TEST PASSED");
            System.out.println("checkbox #1 is selected");
        }else {
            System.out.println("TEST FAILED");
            System.out.println("checkbox #1 is not selected!");
        }


        driver.quit();
    }

 */
}
