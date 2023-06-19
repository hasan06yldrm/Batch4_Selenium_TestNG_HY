package com.krafttech.tests.day05_XPath;

import com.krafttech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_01_CssLoc {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.krafttechexlab.com/login");

        driver.findElement(By.cssSelector("input#email")).sendKeys("mgezer@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        password.sendKeys("Mg12345678"+ Keys.TAB+Keys.TAB+Keys.ENTER);//Tek enter a basmak da yeter
        Thread.sleep(2000);

      /*  WebElement loginBtn = driver.findElement(By.cssSelector("button"));
       // loginBtn.click();
        loginBtn.submit();//enter tuşuna basma işlevi görür. */

        Thread.sleep(2000);

        driver.close();


    }
}
