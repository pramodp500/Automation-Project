package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//-------------Obj Repository--------------------------------

	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement my_account_link;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement register_link;
	
	public void clickOnMyAccountLink() 
	{
	my_account_link.click();
	}
	
	public void clickRegisterLink()
	{
	register_link.click();
	}
}

	

