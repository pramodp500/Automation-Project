package com.opencart.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOut {
	private WebDriver driver;
	public CheckOut ( WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	//----------OBJ Repos-----------
	private By firstname_txtbox = By.xpath("//input[@id='input-payment-firstname']");
	private By lastname_txtbox = By.xpath("//input[@id='input-payment-lastname']");
	private By company_txtbox = By.xpath("//input[@id='input-payment-company']");
	private By address1_txtbox = By.xpath("//input[@id='input-payment-address-1']");
	private By address2_txtbox = By.xpath("//input[@id='input-payment-address-2']");
	private By city_txtbox = By.xpath("//input[@id='input-payment-city']");
	private By postcode_txtbox = By.xpath("//input[@id='input-payment-postcode']");
	private By country = By.xpath("//select[@id='input-payment-country']");
	private By state = By.xpath("//select[@id='input-payment-zone']");
	private By continue_btn = By.xpath("//input[@id='button-payment-address']");
	
	
	private By continue_btn_deli = By.xpath("//input[@id='button-shipping-address']");
	private By continue_btn_delivery = By.xpath("//input[@id='button-shipping-method']");
	private By cod_chkbox = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/input[1]");
	private By continue_btn_cod = By.xpath("//input[@id='button-payment-method']");
	private By confirm_btn = By.xpath("//input[@id='button-confirm']");
	
	
	
	//-----actions----------
	public void enterBillingDetails ()
	{
		driver.findElement(firstname_txtbox).sendKeys("Rahul");
		driver.findElement(lastname_txtbox).sendKeys("sadasd");
		driver.findElement(company_txtbox).sendKeys("wipro");
		driver.findElement(address1_txtbox).sendKeys("kolhapur");
		driver.findElement(address2_txtbox).sendKeys("karad");
		driver.findElement(city_txtbox).sendKeys("pune");
		driver.findElement(postcode_txtbox).sendKeys("416101");
		selectCountry(driver.findElement(country),"India");
		selectState(driver.findElement(state),"Maharashtra");
		driver.findElement(state).click();
		driver.findElement(continue_btn).click();
		
		
	}
	public void selectCountry(WebElement web_elementref, String text)
	{
		Select s= new Select(web_elementref);
		s.selectByVisibleText(text);
	}
	public void selectState(WebElement web_elementref, String text1)
	{
		Select s= new Select(web_elementref);
		s.selectByVisibleText(text1);
	}
	public void clickoncontinue()
	{
		driver.findElement(continue_btn).click();
	}
	
	public void clickoncontinueagain()
	{
		driver.findElement(continue_btn_deli).click();
	}
	public void clickoncontinueagainagain()
	{
		driver.findElement(continue_btn_delivery).click();
	}
	public void clickoncheckbox()
	{
		driver.findElement(cod_chkbox).click();
	}
	public void clickoncontinuebutcod()
	{
		driver.findElement(continue_btn_cod).click();
	}
	public void clickonconfirmorder()
	{
		driver.findElement(confirm_btn).click();
	}
	
}
