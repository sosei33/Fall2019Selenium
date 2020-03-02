package com.atomation.test.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript {

    public static void main(String[] args) {
        //Three(3) this to do
        //1.set chromedriver
        //2.create chromedriver
        //3.open some website
        //1.set chromedriver
        WebDriverManager.chromedriver().setup();
        //2.create chromedriver object
        ChromeDriver driver = new ChromeDriver();
        //3.open some website
        driver.get("http://google.com");

       //First time running error
        //we need to add one thing to fix this issue
    }
}
