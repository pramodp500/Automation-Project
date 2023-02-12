package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	private WebDriver driver;
	public ProductPage ( WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	//===============obj repo=====
	@FindBy (xpath = "//body/div[@id='product-search']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
	private WebElement product_link;
	
	@FindBy (xpath = "//button[@id='button-cart']")
	private WebElement add_to_cart;
	
	@FindBy (xpath="//span[contains(text(),'Shopping Cart')]")
	private WebElement ShoppingCart;
	
	@FindBy (xpath="//a[contains(text(),'Checkout')]")
	private WebElement Checkout;
	
	@FindBy (xpath= "//input[@id='input-email']")
	private WebElement EnterEmailChk;
	
	@FindBy (xpath= "//input[@id='input-password']")
	private WebElement EnterPassChk;
	
	@FindBy (xpath= "//input[@id='button-login']")
	private WebElement ClickLoginbtn;
	
	
	
	
	//---------Action Methods----------
	public void selectProduct()
	{
		product_link.click();
	}
	public void Incart()
	{
		add_to_cart.click();
	}
	public void ClickOnShoppingCart()
	{
		ShoppingCart.click();
	}
	public void ClickOnCheckoutBtn()
	{
		Checkout.click();
	}
	public void EnterEmailforcheckoutLogin(String Emails)
	{
		EnterEmailChk.sendKeys(Emails);
	}
	public void EnterPassforcheckoutLogin(String Pass)
	{
		EnterPassChk.sendKeys(Pass);
	}
	public void ClickOnLoginButn()
	{
		ClickLoginbtn.click();
	}
}
