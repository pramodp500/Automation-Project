package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.CheckOut;
import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.ProductPage;
import com.opencart.testBase.TestBase;
import com.opencart.utilities.UtilClass;

public class BuyFunctionality extends TestBase {
	
	@Test
	public void verifyBuyProject() throws InterruptedException
	{
		String expected_output ="Your order has been placed!";
	HomePage home_obj = new HomePage(driver);
	ProductPage product_obj = new ProductPage(driver);
	CheckOut chk_obj = new CheckOut(driver);
	UtilClass util_obj = new UtilClass();
	
	home_obj.enterproduct("iMac");
	home_obj.searchbtn();
	product_obj.selectProduct();
	product_obj.Incart();
	product_obj.ClickOnShoppingCart();
	product_obj.ClickOnCheckoutBtn();
	product_obj.EnterEmailforcheckoutLogin("rahul77767@gmail.com");
	product_obj.EnterPassforcheckoutLogin("Great789");
	product_obj.ClickOnLoginButn();
	Thread.sleep(2000);
	
	//chk_obj.enterBillingDetails();
	chk_obj.clickoncontinue();
	chk_obj.clickoncontinueagain();
	chk_obj.clickoncontinueagainagain();
	chk_obj.clickoncheckbox();
	chk_obj.clickoncontinuebutcod();
	chk_obj.clickonconfirmorder();
	Thread.sleep(5000);
	String actual_output = util_obj.getPageTitle();
	Assert.assertEquals(actual_output,expected_output);
	}
	
}
