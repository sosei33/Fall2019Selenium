package com.atomation.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    /**
     *
     *
     * @param browserName
     * @return
     */
    public static WebDriver createDriver(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else {
            WebDriverManager.firefoxdriver().version("79.0").setup();
            return new FirefoxDriver();
        }
    }

}
