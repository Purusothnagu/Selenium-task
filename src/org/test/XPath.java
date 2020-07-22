package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\task\\\\Selenium task\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("purus");
		
		WebElement lgin = driver.findElement(By.xpath("//input[@type='submit']"));
		lgin.click();
		
		WebElement sex = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		sex.click();
	}

}
