package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.RegisterPage;
import com.opencart.testBase.TestBase;

public class RegisterTest extends TestBase {
	
	@Test
	public void verifyRegisterFunctions()
	{
		String expected_result = "Your Account Has Been Created!";
		HomePage home_obj = new HomePage(driver);
		RegisterPage register_obj = new RegisterPage(driver);
		home_obj.clickOnMyAccountLink();
		home_obj.clickOnRegisterLink();
		
		register_obj.firstname_box1("Rahul52698");
		register_obj.lastname_box("rastuoe");
		register_obj.enteremail_box("rahul77767@gmail.com");
		register_obj.entertel_box("8569568956");
		register_obj.enterpass_box("Great789");
		register_obj.enterconpassword_box("Great789");
		register_obj.ClickOnPrivacyBox();
		register_obj.ClickOnContinuebtn();
		
		String actual_result = register_obj.GetSuccessMsg();
		System.out.println(actual_result);
		Assert.assertEquals(actual_result,expected_result);
	}
	
}
