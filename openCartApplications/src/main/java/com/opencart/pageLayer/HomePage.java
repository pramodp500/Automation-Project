package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	private WebDriver driver;
	public HomePage ( WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	//----------OBJ Repos-----------
	@FindBy(xpath="//span[contains(text(),'My Account')]")
			private WebElement my_account_link;
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement register_link;
	@FindBy (xpath="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	private WebElement login_link;
	
	@FindBy (xpath="//header/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement Search_box;
	
	@FindBy (xpath="//header/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]")
	private WebElement Clickonsearch;
	
	public void clickOnMyAccountLink() 
	{
		my_account_link.click();
	}
	
	public void clickOnRegisterLink() 
	{
		register_link.click();
	}
	public void clickOnLoginLink() 
	{
		login_link.click();
	}
	public void enterproduct(String ProductName)
	{
		Search_box.sendKeys(ProductName);
	}
	public void searchbtn()
	{
		Clickonsearch.click();
	}
}


