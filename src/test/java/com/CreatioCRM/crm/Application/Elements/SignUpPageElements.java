package com.CreatioCRM.crm.Application.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.CreatioCRM.crm.Framework.Web.Commons.WebCommons;

public class SignUpPageElements extends WebCommons {

	@FindBy(xpath="//div[text()='Create a free account']")
	public WebElement signUpPageHeader;
	
	@FindBy(xpath="//input[@aria-label='First name']")
	public WebElement firstNameTxtb;
	
	@FindBy(xpath="//input[@aria-label='Last name']")
	public WebElement lastNameTxtb;
	
	@FindBy(xpath="//input[@aria-label='Company']")
	public WebElement companyTxtb;
	
	@FindBy(xpath="//input[@aria-label='Website']")
	public WebElement websiteTxtb;
	
	@FindBy(xpath="//input[@aria-label='Country']")
	public WebElement countryTxtb;
	
	@FindBy(xpath="//span[text()='India']")
	public WebElement countryOption;
	
	@FindBy(xpath="//input[@aria-label='Phone']")
	public WebElement phoneTxtb;
	
	@FindBy(xpath="//span[text()=' SIGN UP ']")
	public WebElement SignUpBtn;

	}


