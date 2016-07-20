package com.chungho;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{
        // Create WebDriver reference
        WebDriver driver;

        // Set path for Chrome Driver executable
        System.setProperty("webdriver.chrome.driver", "/Users/Chungho/Downloads/chromedriver");

        // Launch ChromeDriver
        driver = new ChromeDriver();

        // Open the web page
        //driver.get("http://www.dice.com/job/result/10216777/B_DevOps_CA?src=19");
        driver.navigate().to("https://www.dice.com/jobs/detail/Java-Scripts-Front-End-UI-Developer-with-ReactJS-Net-Serpents-LLC-Hillsborough-CA-94010/RTX19813c/611456?icid=sr3-1p&q=java&l=San%20Francisco,%20CA");
        // Enter the text in the search box
        WebElement applyNow = driver.findElement(By.xpath("//button[contains(text(),'Apply Now')]"));
        
        applyNow.click();
        Thread.sleep(3000);
        
       
        WebElement email = driver.findElement(By.id("log-in-view")); 
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("log-in-view")).findElement(By.id("password-input"));
        Thread.sleep(2000);
        email.sendKeys("chungho.song.582@gmail.com");
        password.sendKeys("//");
        
        Thread.sleep(5000);
//        for(WebElement input : authentications) {
//        	if(input.findElement(By.name("email")) != null)
//        		input.findElement(By.name("email")).sendKeys("chungho.song.582@gmail.com");
//        	if(input.findElement(By.name("password")) != null)
//        		input.findElement(By.name("email")).sendKeys("dice1234dice");
//        }
        
        
        WebElement signIn = driver.findElement(By.id("applyJob-log-in-btn"));
        signIn.click();
        Thread.sleep(5000);
        
        WebElement applyType = driver.findElement(By.id("dice-modal-title"));
        if(applyType.getText().equals("Easy Apply")) {
        	
        	List<WebElement> chooseList = driver.findElements(By.className("bfh-selectbox-option"));
            chooseList.get(0).click();
            Thread.sleep(5000);
            
            List<WebElement> listOfLiTags = driver.findElement(By.id("resume-select-options")).findElements(By.tagName("li"));
            for(WebElement li : listOfLiTags) {
                String text = li.getText();
                if(text.equals("Java Developer(Last Updated: 07/19/2016)")) {
                    //do whatever you want and don't forget break
                	li.click();
                	break;
                }
            }
            
            Thread.sleep(5000);
            
            chooseList.get(1).click();

            List<WebElement> list = driver.findElement(By.id("cl-select-options")).findElements(By.tagName("li"));
            for(WebElement li : list) {
                String text = li.getText();
                if(text.equals("automation (Last Updated: 07/20/2016)")) {
                    //do whatever you want and don't forget break
                	li.click();
                	break;
                }
            }
            
            Thread.sleep(3000);
            
            WebElement submit = driver.findElement(By.id("submit-btn"));
            submit.click();
            // Close the driver
        	
        }
        
        driver.quit();

    }

}