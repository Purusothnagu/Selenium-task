package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrow {
	

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\task\\Selenium task\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		WebElement usrName = driver.findElement(By.name("email"));
		usrName.sendKeys("purus");
		WebElement passTxt = driver.findElement(By.name("pass"));
		passTxt.sendKeys("purus");
		WebElement logBtn = driver.findElement(By.id("loginbutton"));
		logBtn.click();
		
	}
	}	
	
