package com.CreatioCRM.crm.Application.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.CreatioCRM.crm.Framework.Web.Commons.WebCommons;

public class ForgotLoginElements extends WebCommons{

	//Forgot Password Link Elements
		@FindBy(xpath="//a[@aria-label='Forgot password?']")
		protected WebElement forgotPasswordLink;

}
