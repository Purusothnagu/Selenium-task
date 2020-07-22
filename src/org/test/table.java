package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public class LaunchBrowtest {
		public void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\task\\Selenium task\\driver\\chromedriver.exe");
			WebDriver driverTab = new ChromeDriver();
			
			driverTab.get("https://www.redbus.in/");
		}
	}
}
