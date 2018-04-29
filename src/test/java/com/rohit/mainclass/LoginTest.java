package com.rohit.mainclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class LoginTest {
	
	public static WebDriver driver;
	
	public void setUp()
	{
		driver=new FirefoxDriver();
	}
	public void doLogin()
	{
		driver.get("https://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("rohitc760");
		driver.findElement(By.id("Passwd")).sendKeys("dedf");
			
	}
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
}
