package com.krafttech.tests.day02_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_02_GetMethods {
    public static void main(String[] args) {
        /**
         * set up a chrome driver
         * navigate to https://www.hepsiburada.com/
         * get title and get url
         * verify that title, url and Page source codes  contain "hepsiburada"
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.hepsiburada.com/");

        String actualTitle=driver.getTitle();
        String actualUrl=driver.getCurrentUrl();
        String actualPageSource=driver.getPageSource();

        if(actualTitle.toLowerCase().contains("hepsiburada")&& actualUrl.toLowerCase()
                .contains("hepsiburada")&&actualPageSource.toLowerCase().contains("hepsiburada")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        driver.close();
    }
}
