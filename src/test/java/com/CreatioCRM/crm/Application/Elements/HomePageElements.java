package com.CreatioCRM.crm.Application.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.CreatioCRM.crm.Framework.Web.Commons.WebCommons;

public class HomePageElements extends WebCommons {
	
	@FindBy(xpath="//span[text()='Application Hub']")
	protected WebElement ApplicationHubHeader;
	@FindBy(xpath="//span[text()='Users']")
	protected WebElement UsersHeader;
	@FindBy(xpath="//span[text()='New application']")
	protected WebElement NewApplicationHeader;
	
	
	
	
	}


