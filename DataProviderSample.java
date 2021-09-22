package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderSample {
	
	
	@DataProvider(name="Sample Datas")
	private Object[][] datas() {
		return new Object[][] {
			
			{"venkat@gmail.com","2222222222"},
			{"isaac@gmail.com","55555555"},
			{"sasi@gmail.com","999999999"}
		};
	}

	@Test(dataProvider="Sample Datas")
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
}
