package com.opencart.testBase;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {

	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		String br = "chrome";
		if (br.equalsIgnoreCase("chrome"))
		
		{
			
			driver = new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		}
		else 
		{
			System.out.println ("Else enter proper Browser name");
		}
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@AfterMethod
	
	public void tear ()
	{
	// driver.quit();
	}
}
