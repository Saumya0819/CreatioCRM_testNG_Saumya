package com.CreatioCRM.crm.Application.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.CreatioCRM.crm.Application.Elements.LoginPageElements;

public class LoginPageSteps extends LoginPageElements {


	public LoginPageSteps(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//Step to Lunch the Application	
	public void launchApplication() {		
		launchApplication();
		Assert.assertEquals(getTitle(), prop.getProperty("title"));
		log("pass","Application is launched successfully");
	}
//Step to verify Login Page Header
	public void verifyLoginHeader() {
		waitForElement(loginPageHeader,5);
		Assert.assertEquals(getElementText(loginPageHeader), prop.get("loginHeader"));
		log("pass","Application Login Header is displayed as expected");
	}
//Step to verify Business Email and password Textbox
	public void enterCredentials(String APP_USER, String APP_PASS) {
		waitForElement(businessEmailTxtb, 5);
		enterText(businessEmailTxtb, APP_USER);
		enterText(passwordTxtb, APP_PASS);
		log("info","Credentials are entered successfully");
		
	}
//Step to click on Login Button
	public void clickOnLoginButton() {
		click(loginBtn);
		log("info","Clicked on the Login Button");
	}
//Step to click on SignUpllink
	public void clickOnSignUpLink() {
		waitForElement(signUpLink, 5);
		jsClick(signUpLink);
		log("info","Clicked on the SignUp Link");
//Step to verify SignUp Link
		Assert.assertTrue(isElementDisplayed(signUpLink));
		log("pass","SignUp Link is displayed as expected");		
	}
//Step to click on LinkedIn Icon to login via LinkedIn
	public void clickOnLinkedInIcon() {
		waitForElement(linkedInIcon, 5);
		jsClick(linkedInIcon);
		log("info","Clicked on the LinkedIn Icon");
		Assert.assertTrue(isElementDisplayed(linkedInIcon));
		log("pass","LinkedIn Icon is displayed as expected");
	}
//Step to click on Google Icon to login via Google
	public void clickOnGoogleIcon() {
		waitForElement(googleIcon, 5);
		jsClick(googleIcon);
		log("info","Clicked on the Google Icon");
		Assert.assertTrue(isElementDisplayed(googleIcon));
		log("pass","Google Icon is displayed as expected");
	}
//Step to click on Facebook Icon to login via Facebook
	public void clickOnFacebookIcon() {
		waitForElement(facebookIcon, 5);
		jsClick(facebookIcon);
		log("info","Clicked on the Facebook Icon");
		Assert.assertTrue(isElementDisplayed(facebookIcon));
		log("pass","Facebook Icon is displayed as expected");
	}
		
		
	

}

