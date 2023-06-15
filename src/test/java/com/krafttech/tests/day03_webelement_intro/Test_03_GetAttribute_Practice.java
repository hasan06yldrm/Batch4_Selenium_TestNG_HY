package com.krafttech.tests.day03_webelement_intro;

import com.krafttech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_03_GetAttribute_Practice {
    public static void main(String[] args) throws InterruptedException {
        /**
         * set up a chrome driver and navigate to http://ourvirtualmarket.com/
         * then close pop up
         * click login link
         * send "fdsddss" to email box
         * then click login
         * then take the message that appears on email box and print the message
         * use lazy way with this task
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://ourvirtualmarket.com/");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='popup-close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(2000);
        WebElement emailInputBox = driver.findElement(By.id("email"));
        emailInputBox.sendKeys("fdsddss");
        Thread.sleep(2000);
        driver.findElement(By.id("send2")).click();
        Thread.sleep(2000);

        System.out.println("emailInputBox.getAttribute(\"validationMessage\") = "
                + emailInputBox.getAttribute("validationMessage"));

        driver.close();



    }

}
