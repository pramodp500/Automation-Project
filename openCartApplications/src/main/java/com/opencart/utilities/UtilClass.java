package com.opencart.utilities;

import org.openqa.selenium.support.PageFactory;

import com.opencart.testBase.TestBase;

public class UtilClass extends TestBase {
	

	public UtilClass ( )
	{
		
		PageFactory.initElements(driver,this);
		
	}
	public String getPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}

}
