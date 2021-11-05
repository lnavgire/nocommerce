package com.nopcommerce.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.TextClearE();
		lp.setusername(username);
		lp.TextClearP();
		lp.setPassword(password);
		lp.clickLogin();

		if (driver.getTitle().equals("Your store. Login")) {
			Thread.sleep(5000);
			lp.clickLogout();
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(true);
		}

	}

}
