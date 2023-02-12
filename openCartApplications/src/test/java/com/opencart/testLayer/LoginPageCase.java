package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.LoginPage;
import com.opencart.testBase.TestBase;
import com.opencart.utilities.UtilClass;

public class LoginPageCase extends TestBase {

	@Test
	public void verifyLoginCase()
	{
		String expected_output ="My Account";
		HomePage home_obj = new HomePage(driver);
		LoginPage login_obj = new LoginPage(driver);
		UtilClass util_obj = new UtilClass();
		home_obj.clickOnMyAccountLink();
		home_obj.clickOnLoginLink();
		login_obj.EnterEmail("rahul77767@gmail.com");
		login_obj.EnterPass("Great789");
		login_obj.LoginClickBtn();
		
		String actual_output = util_obj.getPageTitle();
		Assert.assertEquals(actual_output,expected_output);
	}
	
}
