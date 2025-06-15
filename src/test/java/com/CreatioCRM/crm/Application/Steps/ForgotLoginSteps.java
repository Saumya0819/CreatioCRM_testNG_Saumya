package com.CreatioCRM.crm.Application.Steps;

import org.testng.Assert;

import com.CreatioCRM.crm.Application.Elements.ForgotLoginElements;

public class ForgotLoginSteps extends ForgotLoginElements {
//	step to click on Forgot Password Link
	public void clickOnForgotPasswordLink() {
		waitForElement(forgotPasswordLink, 5);
		jsClick(forgotPasswordLink);
		log("info","Clicked on the Forgot Password Link");
		Assert.assertTrue(isElementDisplayed(forgotPasswordLink));
		log("pass","Forgot Password Link is displayed as expected");
	}


	}

