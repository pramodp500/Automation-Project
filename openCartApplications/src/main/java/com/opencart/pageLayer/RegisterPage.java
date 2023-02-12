package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	private WebDriver driver;
	public RegisterPage ( WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	//-------------obj repo-------
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement firstname_txtbox;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement lastname_txtbox;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement telephone_txtbox;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement confirm_password_txtbox;
	
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement privacy_checkbox;
	
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	private WebElement continue_btn;
	
	@FindBy (xpath="//div[@id='content']/h1")
	private WebElement success_msg;
	
	//---------action Methods-----
	
	public void firstname_box1(String firstname)
	{
		firstname_txtbox.sendKeys(firstname);
	}
	public void lastname_box(String lastname)
	{
		lastname_txtbox.sendKeys(lastname);
	}
	public void enteremail_box(String email)
	{
		email_txtbox.sendKeys(email);
	}
	public void entertel_box(String telephone)
	{
		telephone_txtbox.sendKeys(telephone);
	}
	public void enterpass_box(String password)
	{
		password_txtbox.sendKeys(password);
	}
	public void enterconpassword_box(String cpassword)
	{
		confirm_password_txtbox.sendKeys(cpassword);
	}
	public void ClickOnPrivacyBox()
	{
		privacy_checkbox.click();
	}
	public void ClickOnContinuebtn()
	{
		continue_btn.click();
	}
	public String GetSuccessMsg()
	{
		String text= success_msg.getText();
		return text;
	}
	
}
