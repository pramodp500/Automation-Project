package com.opencart.testLayer;

import org.testng.annotations.Test;

import com.opencart.pageLayer.HomePage;
import com.opencart.testBase.TestBase;

public class RegisterTest extends TestBase {
	
	@Test
	public void verifyRegisterFunctionality()
	{
		HomePage home_obj = new HomePage(driver);
		home_obj.clickOnMyAccountLink();
		home_obj.clickRegisterLink();
		
	}

}
