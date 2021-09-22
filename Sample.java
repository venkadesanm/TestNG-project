package org.testng;

import java.util.Date;

import org.Browser.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends BaseClass{

	WebDriver driver;
	@BeforeClass
	private void stratBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@AfterClass
	private void closeBrowse() {
		driver.quit();
		
	}
	
	@Test(enabled=false)
	private void tc3() {

		System.out.println("test case 3");
	}
	
	@Test
	private void tc2() {
		System.out.println("test case 2");
	}
	@BeforeMethod
	private void startDate() {
		Date d=new Date();
		System.out.println(d);
	}
	@Test(invocationCount=3)
	private void tc1()  {

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("thor");
		
	}
	@AfterMethod
	private void endDate() {
		Date d= new Date();
		System.out.println(d);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
