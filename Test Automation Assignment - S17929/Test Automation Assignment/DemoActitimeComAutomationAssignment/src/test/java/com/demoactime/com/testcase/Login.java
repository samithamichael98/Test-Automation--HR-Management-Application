package com.demoactime.com.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

public class Login {
	
	ChromeDriver driver;
	
	@Test
	public void verifyLoginWithValidCredentials() {
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
  
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
       
        driver.findElement(By.id("loginButton")).click();
    }
	
	@Test
	public void verifyLoginwithincorrectUserName() {
		
		 ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.addArguments("--remote-allow-origins=*");
	        ChromeDriver driver = new ChromeDriver(chromeOptions);
	  
	        driver.get("https://demo.actitime.com/login.do");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("username")).sendKeys("User");
	        driver.findElement(By.name("pwd")).sendKeys("manager");
	       
	        driver.findElement(By.id("loginButton")).click();
		
	}
	
	@Test
	public void verifyLoginwithincorrectPassword() {
		
		 ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.addArguments("--remote-allow-origins=*");
	        ChromeDriver driver = new ChromeDriver(chromeOptions);
	  
	        driver.get("https://demo.actitime.com/login.do");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("username")).sendKeys("admin");
	        driver.findElement(By.name("pwd")).sendKeys("Password");
	       
	        driver.findElement(By.id("loginButton")).click();
	
	}
	
	@Test
	public void SearchUser() {
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
  
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
       
        driver.findElement(By.id("loginButton")).click();    
        driver.findElement(By.id("user")).click();
    }
	
	@Test
	public void SearchReport() {
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
  
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
       
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.linkText("Reports")).click();
	}
	

}	


