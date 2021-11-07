package com.nopcommerce.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddcustomerPage {
	
	
	public WebDriver ldriver; 
	
	public AddcustomerPage(WebDriver rdriver)
	{
	     ldriver=rdriver;
	     PageFactory.initElements(rdriver, this);
	}
	
	By lnkCustomers_menu= By.xpath("//body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]");
    By lnkCustmoer_menuitems= By.xpath("//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/p[1]");
    By btnAddNew = By.xpath("//body/div[3]/div[1]/form[1]/div[1]/div[1]/a[1]");
    
    By txtEmail = By.xpath("//input[@id='Email']");
    By txtPwd   =  By.xpath("//input[@id='Password']");
    By txtFirstName = By.xpath("//input[@id='FirstName']");
    By txtLastName  = By.xpath("//input[@id='LastName']");
    By rdmalegender = By.xpath("//input[@id='Gender_Male']");
    By rdfemalegender = By.xpath("//input[@id='Gender_Female']");
    By txtDoB = By.xpath("//input[@id='DateOfBirth']");
    By txtcompnyname = By.xpath("//input[@id='Company']");
    By checkboxtaxexempt = By.xpath("//input[@id='IsTaxExempt']");
    By txtnewsltr = By.xpath("//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[1]/div[1]/div[2]/div[9]/div[2]/div[1]/div[1]/div[1]/div[1]");

    By txtCustomerRoles = By.xpath("//input[@aria-labelledby='SelectedCustomerRoleIds_label']");
    By lstitemsAddminstator = By.xpath("//li[@id='6120e8df-41f5-4879-993a-d15eac7c70a6']");
    By lstitemForummoderators = By.xpath("//li[contains(text(),'Forum Moderators')]");
    By lstitemsguests = By.xpath("//li[contains(text(),'Guests')]");
    By lstitemsRegisterd = By.xpath("//li[contains(text(),'Registered')]");
    By lstitemsVendors = By.xpath("//li[contains(text(),'Vendors')]");
    By txtAdmincontent =By.xpath("//textarea[@id='AdminComment']");
    By btnSave = By.xpath("//button[@name='save']");
    
    
    public void clickOncustmomerMenu()
    {
    	ldriver.findElement(lnkCustomers_menu).click();
    }
    
    public void clickOnCustomersMenuitems()
    {
    	ldriver.findElement(lnkCustmoer_menuitems).click();
    }
    
    public void clickOnAddNew()
    {
    	ldriver.findElement(btnAddNew).click();
    }
    
    public void setEmail(String email)
    {
    	ldriver.findElement(txtEmail).sendKeys(email);
    }
    
    public void setPassword(String password)
    {
    	ldriver.findElement(txtPwd).sendKeys(password);
    }
    
    public void setFirstName(String fname)
	{
		ldriver.findElement(txtFirstName).sendKeys(fname);
	}
    
    public void setLastName(String lname)
	{
		ldriver.findElement(txtLastName).sendKeys(lname);
	}
    
    public void setGender(String gender)
	{
		if(gender.equals("Male"))
		{
			ldriver.findElement(rdmalegender).click();
		}
		else if(gender.equals("Female"))
		{
			ldriver.findElement(rdfemalegender).click();
		}
		else
		{
			ldriver.findElement(rdmalegender).click();//Default
		}
		
	}
    
    public void setDob(String dob)
	{
		ldriver.findElement(txtDoB).sendKeys(dob);
	}
    
    public void setCompanyName(String comname)
	{
		ldriver.findElement(txtcompnyname).sendKeys(comname);
	}
    
	public void setCustomerRoles(String role) 
	{
		ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]")).click();
	
		ldriver.findElement(txtCustomerRoles).click();
					
		WebElement listitem;
		
		switch(role)
		{
		case "Administrators":
				listitem=ldriver.findElement(lstitemsAddminstator); break;
		case "Guests":
				listitem=ldriver.findElement(lstitemsguests); break;
		case "Registered":
			listitem=ldriver.findElement(lstitemsRegisterd); break;
		case "Vendors":
			listitem=ldriver.findElement(lstitemsVendors); break;
		default:
			listitem=ldriver.findElement(lstitemsguests);
		}
					
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();", listitem);
		
	}
		public void setManagerOfVendor(String value)
		{
			Select drp=new Select(ldriver.findElement(lstitemsVendors));
			drp.selectByVisibleText(value);
		}
		
		public void setAdminContent(String content)
		{
			ldriver.findElement(txtAdmincontent).sendKeys(content);
		}
		
		public void clickOnSave()
		{
			ldriver.findElement(btnSave).click();
		}
		
	}

	
    

