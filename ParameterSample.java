package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterSample {

	@Parameters({"username","password"})
	@Test
	private void tc1(String email, String password) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys(email);
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys(password);
	}
	@Parameters({"user","passwo"})
	@Test
	private void tc2(@Optional("ram")String email, @Optional("111111")String password) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys(email);
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys(password);

	}
}
