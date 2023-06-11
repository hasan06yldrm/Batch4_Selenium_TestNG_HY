package com.krafttech.tests.day01_automationIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_01_OpenBrowser {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        driver.get("https://facebook.com");//Böyle de çalışır

        //sayfanın title inı alalım
        String actualTitle=driver.getTitle();
        String expectedTitle="Facebook – log in or sign up";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        WebDriver driver1=new ChromeDriver();
        driver1.get("https:www.google.com");
        driver1.quit();//Farklı iki pencereyi kapatmaz sadece 1 pencerenin hepsini kapatır
        //driver.close();
        


    }
}
