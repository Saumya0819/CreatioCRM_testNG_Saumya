package com.CreatioCRM.crm.Application.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.CreatioCRM.crm.Framework.Web.Commons.WebCommons;

public class LoginPageElements extends WebCommons{
//	Log in to your account elements
	@FindBy(xpath="//span[text()='LOG IN TO YOUR ACCOUNT']")
	protected WebElement loginPageHeader;
//Business Email Elements
	@FindBy(xpath="//input[@aria-label='Business email']")
	protected WebElement businessEmailTxtb;
//Password Elements
	@FindBy(xpath="//input[@aria-label='Password']")
	protected WebElement passwordTxtb;	
//Log In Button Elements
	@FindBy(xpath="//button[@aria-label=' LOG IN '']")
	protected WebElement loginBtn;
//Forgot Password Link Elements
	@FindBy(xpath="//a[@aria-label='Forgot password?']")
	protected WebElement forgotPasswordLink;	
//Login using LinkedIn Button Elements
	@FindBy(xpath="//img[@class='icon-LinkedIn']")
	protected WebElement linkedInIcon;
//Login using Google Button Elements
	@FindBy(xpath="//img[@class='icon-Google']")
	protected WebElement googleIcon;
//Login using Facebook Button Elements
	@FindBy(xpath="//img[@class='icon-facebook']")
	public WebElement facebookIcon;
//Don’t have an account Elements
	@FindBy(xpath="//span[text()='Don’t have an account?']")
	public WebElement dontHaveAnAccountText;
//Sign Up Button Elements
	@FindBy(xpath="//button[@aria-label=' SIGN UP ']")		
	protected WebElement signUpBtn;

}
