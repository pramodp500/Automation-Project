package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	public LoginPage ( WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//-------------obj repo-----------
	
	@FindBy (xpath="//input[@id='input-email']")
	private WebElement Email_txtbox;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement Password_txtbox;
	
	@FindBy (xpath ="//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	private WebElement ClickOnLoginBtn;
	
	//----------Action Reposs..........
	
	public void EnterEmail(String Email)
	{
		Email_txtbox.sendKeys(Email);
	}
	public void EnterPass(String Password)
	{
		Password_txtbox.sendKeys(Password);
	}
	public void LoginClickBtn()
	{
		ClickOnLoginBtn.click();
	}
	
	

}
