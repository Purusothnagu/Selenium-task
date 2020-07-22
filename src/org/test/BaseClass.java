package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	public static void launchApp(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\task\\Selenium task\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
}
	
	public static void enterText(String xpath, String text) {
		WebElement usrtxt = driver.findElement(By.xpath(xpath));	
		usrtxt.sendKeys(text);
	}
	
	public static void click(String xpath) {
		WebElement logbtn = driver.findElement(By.xpath(xpath));
		logbtn.click();
	}
	
	public static String gettext(String xpath) {
		WebElement gettxt = driver.findElement(By.xpath(xpath));
		String t = gettxt.getText();
		System.out.println(t);
		return t;

	}
	
	public static void getattribute(String id, String txt) {
		WebElement attval = driver.findElement(By.id(id));
		String att = attval.getAttribute(txt);
		System.out.println(att);
	}
	
	public static void dragDrop(String source, String target	) {
		WebElement src = driver.findElement(By.xpath(source));
		WebElement dest = driver.findElement(By.xpath(target));
	
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
			
	}
	
	public static void placeOver(String xpath) {
		
		WebElement dest = driver.findElement(By.xpath(xpath));
		Actions act = new Actions(driver);
		act.moveToElement(dest).perform();
		}
	
	public static void rightClick(String xpath) {
		
		WebElement dest = driver.findElement(By.xpath(xpath));
		Actions act = new Actions(driver);
		act.contextClick(dest).perform();
		
	}
	
	public static void keyPress(String key, int keycode) throws Exception {
		
		Robot r = new Robot();
		r.keyPress(keycode);
		
		
	}
	
	public static void doubleClick(String xpath) {
		
		WebElement dest = driver.findElement(By.xpath(xpath));
		Actions act = new Actions(driver);
		act.doubleClick(dest).perform();
			
	}
	
	public static void scrolldown(String xpath) {
		
		WebElement ele = driver.findElement(By.xpath(xpath));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView(true)", ele);
		
		
	}
	public static void scrollup(String xpath) {
		
		WebElement ele = driver.findElement(By.xpath(xpath));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView(false)", ele);
		
		
	}

	public static void screenShot() throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File scrnsht = ts.getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		int S = d.getSeconds();
		
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\task\\Selenium task\\screenshot\\test"+S+".png");

		FileUtils.copyFile(scrnsht, f);
		

	}
	
	public static void drpDown(String xpath, String value) {
		
		WebElement dropDown = driver.findElement(By.xpath(xpath));
		Select s = new Select(dropDown);
	
		s.selectByValue(value);
	
	}
	
	
	public static void table() {
		WebElement tble = driver.findElement(By.tagName("table"));
		List<WebElement> trows = tble.findElements(By.tagName("tr"));
		for (WebElement x : trows) {
			List<WebElement> tdata = x.findElements(By.tagName("td"));
			for (WebElement y : tdata) {
				String text = y.getText();
				
				if (text.equals("15")) {
					y.click();
				}
				
				
			}
			
		}
	
	
	
	}
}



