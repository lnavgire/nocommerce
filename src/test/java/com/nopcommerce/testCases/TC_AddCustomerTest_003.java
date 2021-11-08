package com.nopcommerce.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.AddcustomerPage;
import com.nopcommerce.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {
	
		@Test
		public void addNewCustomer() throws IOException
		{
			driver.get(baseURL);
			
			LoginPage lp =new LoginPage(driver);
			
			lp.TextClearE();
			lp.setusername(username);
			logger.info("username is provided");
			
			lp.TextClearP();
			lp.setPassword(password);
			logger.info("Password is provided");
			
			lp.clickLogin();
			
			AddcustomerPage addcust= new AddcustomerPage(driver);
			
			addcust.clickOncustmomerMenu();
			addcust.clickOnCustomersMenuitems();
			addcust.clickOnAddNew();    //add new customer
			
			addcust.setEmail("ankithh@gmail.com");
			logger.info("EmailID is provided");
			addcust.setPassword("asgshsh123");
			logger.info("Password is provided");
			addcust.setFirstName("ankit");
			logger.info("FirstName is provided");
			addcust.setLastName("bhosale");
			logger.info("lastName is provided");
			
			
		//	addcust.setManagerOfVendor("Vendor2");
			
			
			addcust.setGender("Male");
			logger.info("Gender Is Selcetd");
			
			addcust.setDob("7/05/1985"); // Format: D/MM/YYY
			logger.info("DOB is provided");
		
			addcust.setCompanyName("SDET");
			logger.info("CompanyName is provided");
			addcust.setAdminContent("This is for testing.........");
			logger.info("AdminContent is provided");
			
			addcust.clickOnSave();
			logger.info("Clicked On Save");
			
			logger.info("validation started....");
			
			String msg = driver.findElement(By.tagName("body")).getText();
			
			
			if(msg.contains("The new customer has been added successfully"))
			{
				Assert.assertTrue(true);
				logger.info("test case passed....");
			}
			else
			{
				captureScreen(driver,"addNewCustomer");
				Assert.assertTrue(false);
			}
			
			
			
			
			
			
		}

}
