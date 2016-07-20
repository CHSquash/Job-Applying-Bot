package com.chungho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{
        // Create WebDriver reference
        WebDriver driver;

        // Set path for Chrome Driver executable
        System.setProperty("webdriver.chrome.driver", "/Users/chungho/Downloads/chromedriver");

        // Launch ChromeDriver
        driver = new ChromeDriver();

        // Open the web page
        //driver.get("http://www.dice.com/job/result/10216777/B_DevOps_CA?src=19");
        driver.navigate().to("http://www.dice.com/job/result/10216777/B_DevOps_CA?src=19");
        // Enter the text in the search box
        WebElement searchText = driver.findElement(By.xpath("//button[contains(text(),'Apply Now')]"));
        System.out.println(searchText.toString());
        searchText.click();
        Thread.sleep(100000);

       // WebElement searchText = driver.findElement(By.xpath("//button[contains(text(),'Apply Now')]"));


        System.out.println("a");
        // Close the driver
        driver.quit();

    }

}